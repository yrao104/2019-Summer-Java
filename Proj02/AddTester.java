/*Look into the API documentation of the Rectangle class and locate the method
 * void add(int newx, intnewy). Read through the method documentation. Determine
 * the result of the following statements:
 * Rectangle box = new Rectangle(5, 10, 20, 30);
 * box.add (0, 0);
 * Write a program AddTester that prints the expected and actual location, width,
 * and height of box after the call to add
 */

import java.awt.Rectangle;

public class AddTester{
    public static void main(String[] args){
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        System.out.println("Location: " + box.getLocation());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
        System.out.println("Expected Location: (0, 0)");
        System.out.println("Expected Width: 25");
        System.out.println("Expected Height: 40");
    }
}