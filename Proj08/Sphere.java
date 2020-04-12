
/**
 * Calculates the surface area and volume of a sphere.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Sphere
{
    // instance variables
    private double r;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere(double radius)
    {
        r = radius;
    }

    /**
     * Returns the volume of the sphere
     * @return The volume of the sphere
     */
    public double getVolume()
    {
        double volume = 4.0/3 * Math.PI * Math.pow(r, 3);
        return volume;
    }
    
    /**
     * Returns the surface area of the sphere
     * @return The surface area of the sphere
     */
    public double getSurface()
    {
       double surfaceArea = 4 * Math.PI * Math.pow(r, 2);
        return surfaceArea;
    }
}
