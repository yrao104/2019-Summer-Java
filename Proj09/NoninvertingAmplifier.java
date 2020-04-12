
/**
 * This class represents a noninverting amplifier.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class NoninvertingAmplifier extends Amplifier
{
    // instance variables
    private double r1;
    private double r2;
    
    //constructors
    /**
     * Constructor for objects of class NoninvertingAmplifier
     *  @param resistance1 The first resistance value 
     * @param resistance2 The second resistance value
     */
    public NoninvertingAmplifier(double resistance1, double resistance2)
    {
        super();
        r1 = resistance1;
        r2 = resistance2;
    }
    
    //methods
    /**
     * Returns the gain of the amplifier
     *
     * @return gain2 The gain of the amplifier
     */
    public double getGain()
    {
        double gain2 = 1 + (r2 / r1);
        return gain2;
    }
    
    /**
     * Returns the type the amplifier
     *
     * @return type The type of amplifier
     */
    public String getDescription()
    {
        String type = "NONINVERTING AMPLIFIER";
        return type;
    }
}
