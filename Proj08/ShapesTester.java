
/**
 * Tester for cube, sphere, cylinder, and cone classes.
 */
public class ShapesTester
{
    public static void main(String[] args){
        Cube cubeTester = new Cube(5);
        Sphere sphereTester = new Sphere(5);
        Cylinder cylinderTester = new Cylinder(2, 5);
        Cone coneTester = new Cone(2, 5);
        
        double cubeVolume = cubeTester.getVolume();
        double cubeSurfaceArea = cubeTester.getSurface();
        double sphereVolume = sphereTester.getVolume();
        double sphereSurfaceArea = sphereTester.getSurface();
        double cylinderVolume = cylinderTester.getVolume();
        double cylinderSurfaceArea = cylinderTester.getSurface();
        double coneVolume = coneTester.getVolume();
        double coneSurfaceArea = coneTester.getSurface();
        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Cube Surface Area: " + cubeSurfaceArea);
        System.out.println("Sphere Volume: " + sphereVolume);
        System.out.println("Sphere Surface Area: " + sphereSurfaceArea);
        System.out.println("Cylinder Volume: " + cylinderVolume);
        System.out.println("Cylinder Surface Area: " + cylinderSurfaceArea);
        System.out.println("Cone Volume: " + coneVolume);
        System.out.println("Cone Surface Area: " + coneSurfaceArea);
    }
}
