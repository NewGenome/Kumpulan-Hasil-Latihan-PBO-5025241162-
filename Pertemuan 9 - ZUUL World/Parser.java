import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Parser {
    private CommandWords commands; 
    public Parser() {
        commands = new CommandWords(); 
    }

    public Command getCommand() {
        String inputLine = "";  
        String word1 = null;
        String word2 = null;

        System.out.print("> ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLine = reader.readLine();
        } catch (java.io.IOException exc) {
            System.out.println("There was an error during reading: " + exc.getMessage());
        }
        StringTokenizer tokenizer = new StringTokenizer(inputLine);

        if (tokenizer.hasMoreTokens()) {
            word1 = tokenizer.nextToken();
        }

        if (tokenizer.hasMoreTokens()) {
            word2 = tokenizer.nextToken();
        }

        if (commands.isCommand(word1)) {
            return new Command(word1, word2); 
        } else {
            return new Command(null, word2); 
        }
    }
}