
/**
 * Write a description of class ClockD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockD
{
    private NumbD hour;
    private NumbD minute;
    private NumbD sec;
    private String displayString;
    
    public ClockD()
    {
        hour = new NumbD(24);
        minute = new NumbD(60);
        sec = new NumbD(60);
        updateDisplay();
    }

    public ClockD(int hours, int minutes, int secs)
    {
        hour = new NumbD(24);
        minute = new NumbD(60);
        sec = new NumbD(60);
        setTime(hours,minutes,secs);
    }
    public void Tick(){
        sec.increment();
        if (sec.getval() == 0) {
            minute.increment();
        
        if(minute.getval() == 0) {
            hour.increment();
        }
    }
        updateDisplay();
    }
    public void setTime(int hours, int minutes, int secs){
        hour.setval(hours);
        minute.setval(minutes);
        sec.setval(secs);
        updateDisplay();
    }
    public String getTime(){
        return displayString;
    }
    private void updateDisplay(){
        displayString = hour.getdisplayval() + ":" + minute.getdisplayval() + ":" + sec.getdisplayval();
    }
}