
/**
 * This class represents an appointment book.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public abstract class Appointment
{
    // instance variables
    private String description;
    private int date;
    
    //constructors
    /**
     * Constructor for objects of class Appointment
     */
    public Appointment()
    {
        description = "";
        date = 0;
    }
    
    //methods
    /**
     * Sets the description of the appointment
     *
     * @param  descriptionGiven the description the user gives
     */
    public void setDescription(String descriptionGiven)
    {
        description = descriptionGiven;
    }
    
    /**
     * Sets the description of the appointment
     *
     * @param  descriptionGiven the description the user gives
     */
    public void setDate(int dateGiven)
    {
        date = dateGiven;
    }
    
    /**
     * Sets the description of the appointment
     *
     * @param  descriptionGiven the description the user gives
     */
    public void setDate(int month, int year, int day)
    {
        date = month+year+day;
    }
    
    public abstract boolean occursOn(int year, int month, int day);
    
    public String toString(){
        return description;
    }
    
}
