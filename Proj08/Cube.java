
/**
 * Calculates the surface area and volume of a cube.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Cube
{
    // instance variables
    private double h;

    /**
     * Constructor for objects of class Cube
     */
    public Cube(double height)
    {
        h = height;
    }

    /**
     * Returns the volume of the cube
     * @return The volume of the cube
     */
    public double getVolume()
    {
        double volume = h*h*h;
        return volume;
    }
    
    /**
     * Returns the surface area of the cube
     * @return The surface area of the cube
     */
    public double getSurface()
    {
       double surfaceArea = h*h*6;
       return surfaceArea;
    }
}
