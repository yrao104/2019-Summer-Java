
/**
 * This class prompts the user for 2 integers and then prints the sum, difference, product, average, distance, maximum, and minimum.
 *
 * @author Yamuna Rao
 * @version 1.0
 */
import java.lang.Math;
import java.util.Scanner;

public class E45
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
        
        System.out.printf("Sum: %9d", sum);
        System.out.printf("\nDifference: %d", difference);
        System.out.printf("\nProduct: %5d", product);
        System.out.printf("\nAverage: %5d", average);
        System.out.printf("\nDistance: %4d", distance);
        System.out.printf("\nMaximum: %5d", maximum);
        System.out.printf("\nMinimum: %5d", minimum);
    }
}
