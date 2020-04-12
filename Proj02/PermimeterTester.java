/* Write a PerimeterTester program that constructs a Rectangle object
 * and then computes and prints its perimeter. Use the getWidth and getHeight
 * methods. Also print the expected answer
 */

import java.awt.Rectangle;

public class PermimeterTester{
    public static void main(String[] args){
        Rectangle rect = new Rectangle(5, 10, 20, 30);
        double perimeter = (rect.getWidth() + rect.getHeight()) * 2;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Expected: 100");
    }
    
  

  
    
}