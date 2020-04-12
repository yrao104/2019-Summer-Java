
/**
 * This class represents one kind of coin, with a value and name.
 * 
 * @author A. Nguyen 
 * @version 1.0
 */
public class Coin{
    // fields
    private double value; // value, in dollars, of the coin; 1.0, .25, etc.
    private String name; // name of the coin; e.g., dollar, quarter, etc.
    private int num;
    
    // constructor
    public Coin(double aValue, String aName) {
        value = aValue;
        name = aName;
    }
    
    // methods
    public double getValue() {
         return value;
    }
    
    public String getName() {
         return name;
    }
    
}
