
/**
 * This class prompts the user for a radius and then prints the area, circumference, volume, and surface area.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

import java.lang.Math;
import java.util.Scanner;

public class E47
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a raidius measurement: ");
        double radius = in.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        double volume = 4 * Math.PI * Math.pow(radius, 3) / 3;
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}
