
/**
 * This class represents an inverting amplifier.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class InvertingAmplifier extends Amplifier
{
    // instance variables
    private double r1;
    private double r2;
    
    //constructors
    /**
     * Constructor for objects of class InvertingAmplifier
     * @param resistance1 The first resistance value 
     * @param resistance2 The second resistance value
     */
    public InvertingAmplifier(double resistance1, double resistance2)
    {
        super();
        r1 = resistance1;
        r2 = resistance2;
    }

    //methods
    /**
     * Returns the gain of the amplifier
     *
     * @return gain1 The gain of the amplifier
     */
    public double getGain()
    {
        double gain1 = -(r2 / r1);
        return gain1;
    }
    
    /**
     * Returns the type the amplifier
     *
     * @return type The type of amplifier
     */
    public String getDescription()
    {
        String type = "INVERTING AMPLIFIER";
        return type;
    }
}
