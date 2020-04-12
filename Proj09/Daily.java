
/**
 * This is a subclass of Apointment.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Daily extends Appointment
{
    //instance variables

    //constructors
    /**
     * Constructor for objects of class Daily
     */
    public Daily()
    {
        super();
    }

    //methods

    /**
     * Checks whether the appointment occurs on that date
     *
     * @param  year The year of the appointment
     * @param  month The month of the appointment
     * @param  day The day of the appointment
     * @return String The string telling the user when the appointment occurs
     */
    public boolean occursOn(int month, int day, int year)
    {
        return true;
    }
}
