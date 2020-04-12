
/**
 * This is a subclass of Apointment.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Monthly extends Appointment
{
    // instance variables
    private int date;
    
    //constructors
    /**
     * Constructor for objects of class Monthly
     */
    public Monthly()
    {
        super();
        date = 0;
    }
    
    //methods
    /**
     * Sets the date of the appointment
     *
     * @param  dateGiven the date the user gives
     */
    public void setDate(int dateGiven)
    {
        date = dateGiven;
    }
    
    /**
     * Checks whether the appointment occurs on that date
     *
     * @param  year The year of the appointment
     * @param  month The month of the appointment
     * @param  day The day of the appointment
     * @return statement A String letting the user know when the appointment occurs
     */
    public boolean occursOn(int month, int day, int year)
    {
        boolean statement;
        if(("" + date).equals("" + month + day + year)){
            statement = true;
        }
        else{
            statement = false;
        }
        return statement;
    }
}
