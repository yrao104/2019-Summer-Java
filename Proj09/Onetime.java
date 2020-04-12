
/**
 * This is a subclass of Apointment.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Onetime extends Appointment
{
    // instance variables
    private int year;
    private int month;
    private int day;
    
    //constructors
    /**
     * Constructor for objects of class Onetime
     */
    public Onetime()
    {
        year = 0;
        month = 0;
        day = 0;
    }

    //methods
    
    /**
     * Sets the date of the appointment
     *
     * @param  monthGiven the month the user gives
     * @param  dayGiven the day the user gives
     * @param  yearGiven the year the user gives
     */
    public void setDate(int monthGiven, int dayGiven, int yearGiven)
    {
        year = yearGiven;
        day = dayGiven;
        month = monthGiven;
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
        if(year == year && month == month && day == day){
            statement = true;
        }
        else{
            statement = false;
        }
        return statement;
    }
}
