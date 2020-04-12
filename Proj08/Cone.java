
/**
 * Calculates the surface area and volume of a cone.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Cone
{
    // instance variables
    private double r;
    private double h;

    /**
     * Constructor for objects of class Cone
     */
    public Cone(double radius, double height)
    {
        r = radius;
        h = height;
    }

    /**
     * Returns the volume of the cylinder
     * @return The volume of the cylinder
     */
    public double getVolume()
    {
        double volume = Math.PI * Math.pow(r, 2) * 1.0/3;
        return volume;
    }
    
    /**
     * Returns the surface area of the cylinder
     * @return The surface area of the cylinder
     */
    public double getSurface()
    {
       double surfaceArea = Math.PI * r * (r + Math.sqrt(h*h + r*r));
        return surfaceArea;
    }
}
