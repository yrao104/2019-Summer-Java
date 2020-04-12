
/**
 * This class prompts the user for a measurement in meters and hen converts it to miles, feet, and inches.
 *
 * @author Yamuna Rao
 * @version 1.0
 */
import java.lang.Math;
import java.util.Scanner;

public class E46
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a measurement in meters: ");
        double meters = in.nextDouble();
        
        int miles = (int)meters/1609;
        int feet = (int)((meters%1609) / .3048);
        double inches = (((meters%1609) %.3048) % .0254);
        
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }
}
