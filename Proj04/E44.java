
/**
 * This class prompts the user for 2 integers and then prints the sum, difference, product, average, distance, maximum, and minimum.
 *
 * @author Yamuna Rao
 * @version 1.0
 */
import java.lang.Math;
import java.util.Scanner;

public class E44
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter an integer: ");
        int x = in.nextInt();
        
        System.out.print("Please enter another integer: ");
        int y = in.nextInt();
        
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        int average = (x + y) / 2;
        int distance = Math.abs((x - y));
        int maximum = Math.max(x, y);
        int minimum = Math.min(x, y);
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
