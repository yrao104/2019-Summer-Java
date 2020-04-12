
/**
 * This class represents an amplifier.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Amplifier
{
    // instance variables
    private double input;
    private double output;
    private String description;

    //constructors
    /**
     * Constructor for objects of class Amplifier
     */
    public Amplifier()
    {
        input = 0;;
        output = 0;;
        description = "";
    }

    /**
     * Returns the gain of the amplifier
     *
     * @return gain The gain of the amplifier
     */
    public double getGain()
    {
       double gain = output / input;
       return gain;
    }
    
    /**
     * Returns the type of amplifier
     *
     * @return description A string identifying the type of amplifier
     */
    public String getDescription()
    {
        description = "REGULAR AMPLIFIER";
        return description;
    }
}
