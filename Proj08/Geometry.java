
/**
 * Finds the surface area and volume of different 3d figures.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Geometry
{
    public static double cubeVolume(double h){
        double volume = h*h*h;
        return volume;
    }
    
    public static double cubeSurface(double h){
        double surfaceArea = h*h*6;
        return surfaceArea;
    }
    
    public static double sphereVolume(double r){
        double volume = 4.0/3 * Math.PI * Math.pow(r, 3);
        return volume;
    }
    
    public static double sphereSurface(double r){
        double surfaceArea = 4 * Math.PI * Math.pow(r, 2);
        return surfaceArea;
    }
    
    public static double cylinderVolume(double r, double h){
        double volume = Math.PI * Math.pow(r, 2) * h;
        return volume;
    }
    
    public static double cylinderSurface(double r, double h){
        double surfaceArea = Math.PI * Math.pow(r, 2) * 2 + Math.PI * r * 2 * h;
        return surfaceArea;
    }
    
    public static double coneVolume(double r, double h){
        double volume = Math.PI * Math.pow(r, 2) * 1.0/3;
        return volume;
    }
    
    public static double coneSurface(double r, double h){
        double surfaceArea = Math.PI * r * (r + Math.sqrt(h*h + r*r));
        return surfaceArea;
    }
    
    public static void main(String[] args){
        double cubeVolumeResult = Geometry.cubeVolume(5);
        double cubeSurfaceResult = Geometry.cubeSurface(5);
        double sphereVolumeResult = Geometry.sphereVolume(5);
        double sphereSurfaceResult = Geometry.sphereSurface(5);
        double cylinderVolumeResult = Geometry.cylinderVolume(2, 5);
        double cylinderSurfaceResult = Geometry.cylinderSurface(2, 5);
        double coneVolumeResult = Geometry.coneVolume(2, 5);
        double coneSurfaceResult = Geometry.coneSurface(2, 5);
        System.out.println("Cube Volume: " + cubeVolumeResult);
        System.out.println("Cube Surface: " + cubeSurfaceResult);
        System.out.println("Sphere Volume: " + sphereVolumeResult);
        System.out.println("Sphere Surface: " + sphereSurfaceResult);
        System.out.println("Cylinder Volume: " + cylinderVolumeResult);
        System.out.println("Cylinder Surface: " + cylinderSurfaceResult);
        System.out.println("Cone Volume: " + coneVolumeResult);
        System.out.println("Cone Surface: " + coneSurfaceResult);
    }
}    