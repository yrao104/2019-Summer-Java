
/**
 * This class represents a voltage divider amplifier.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class VoltageDividerAmplifier extends Amplifier
{
    // instance variables
    private double r1;
    private double r2;
    
    //constructors
    /**
     * Constructor for objects of class VoltageDividerAmplifier
     *  @param resistance1 The first resistance value 
     * @param resistance2 The second resistance value
     */
    public VoltageDividerAmplifier(double resistance1, double resistance2)
    {
        super();
        r1 = resistance1;
        r2 = resistance2;
    }

    //methods
    /**
     * Returns the gain of the amplifier
     *
     * @return gain3 The gain of the amplifier
     */
    public double getGain()
    {
        double gain3 = r2 / (r1 + r2);
        return gain3;
    }
    
    /**
     * Returns the type the amplifier
     *
     * @return type The type of amplifier
     */
    public String getDescription()
    {
        String type = "VOLTAGE DIVIDER AMPLIFIER";
        return type;
    }
}
