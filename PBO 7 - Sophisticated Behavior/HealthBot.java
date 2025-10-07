import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class HealthBot {
    private Map<String, String> responses;
    private Random random;

    public HealthBot() {
        responses = new HashMap<>();
        random = new Random();

        responses.put("sick", "What symptoms are you experiencing, list them one by one?");
        responses.put("help", "What can I help you with?");
        responses.put("dead", "How unfortunate :( Please seek immediate help if this is serious.");
        responses.put("headache", "Try getting more sleep and taking prescribed pills if necessary.");
        responses.put("stomach", "Try to avoid spicy food.");
        responses.put("tired", "Make sure you’re getting enough rest.");
        responses.put("cough", "You could try some cough syrup.");
        responses.put("fever", "Stay hydrated and get enough rest.");
        responses.put("pain", "You could try some over-the-counter pain relievers.");
        responses.put("cold", "Stay warm and drink plenty of fluids.");
        responses.put("flu", "You could try antiviral medications.");
        responses.put("allergy", "You could try some antihistamines.");
        responses.put("infection", "You might need antibiotics. Please consult a doctor.");
        responses.put("anxiety", "Try some relaxation techniques or talk to a mental health professional.");
        responses.put("depression", "It's important to seek help from a mental health professional.");
    }

    public String getResponse(String userInput) {
        String[] words = userInput.toLowerCase().split("\\s+");
        for (String w : words) {
            if (responses.containsKey(w)) {
                return responses.get(w);
            }
        }

        String[] generic = {
            "Could you be more specific?",
            "I don’t get it could you please provide more details.",
            "Try asking in a different way, unc.",
            "I'm not sure I understand what you are saying man...."
        };
        return generic[random.nextInt(generic.length)];
    }

    public static void main(String[] args) {
        HealthBot bot = new HealthBot();
        InputReader inputReader = new InputReader();

        System.out.println("Hello there! I'm HealthBot, your personal health assistant!!!!!!. How can I help you today, friend?");
        while (true) {
            String input = inputReader.getInput();
            if (input.equalsIgnoreCase("exit"))  {
                System.out.println("Goodbye and dont forget to always stay healthy!");
                break;
            }
            System.out.println(bot.getResponse(input));
        }
    }
}
