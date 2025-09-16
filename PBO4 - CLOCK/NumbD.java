
/**
 * Write a description of class NumbD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumbD
{
    // instance variables - replace the example below with your own
    private int lim;
    private int val;

    /**
     * Constructor for objects of class NumbD
     */
    public NumbD(int RoL)
    {
        lim = RoL;
        val = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getval()
    {
        return val;
    }
    public String getdisplayval(){
        if(val<10){
            return "0" + val;
        }
        else{
            return "" + val;
        }
    }
    public void setval(int replaceval){
        if((replaceval >= 0) && (replaceval<lim)) {
            val = replaceval;
        }
    }
    public void increment(){
        val = (val+1) % lim;
    }

    
}