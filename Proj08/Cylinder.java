
/**
 * Calculates the surface area and volume of a cylinder.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Cylinder
{
    // instance variables
    private double r;
    private double h;

    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder(double radius, double height)
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
        double volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }
    
    /**
     * Returns the surface area of the cylinder
     * @return The surface area of the cylinder
     */
    public double getSurface()
    {
       double surfaceArea = Math.PI * Math.pow(r, 2) * 2 + Math.PI * r * 2 * h;
        return surfaceArea;
    }
}
