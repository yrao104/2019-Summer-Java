
/**
 * This class calculates the BMI of a person.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
import java.util.Scanner;
import java.lang.Math;

public class BMICalculator
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = in.next();
        System.out.print("\nPlease enter your age: ");
        int age = in.nextInt();
        System.out.print("\nPlease enter your weight in pounds: ");
        double weight = in.nextDouble();
        System.out.print("\nPlease enter your height in inches: ");
        int height = in.nextInt();
        
        double wt = (weight * 0.453592); //conversion from pounds to kilograms
        double ht = (height * 0.0254); //conversion from inches to meters
        
        double BMI = wt / Math.pow(ht, 2);
        
        System.out.println("\nBMI for " + name + ", age " + age + ", is " + BMI);
    }
}
