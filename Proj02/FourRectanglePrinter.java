/* Write a program called FourRectanglePrinter that constructs a Rectangle object,
 * prints its location by calling System.out.println(box) and then translates
 * and prints it three more times, so that if the rectangles were drawn, they would 
 * form one large rectangle. Simply print the locations, do not produce the
 * drawing.
 */

import java.awt.Rectangle;

public class FourRectanglePrinter{
    public static void main(String[] args){
       Rectangle rect1 = new Rectangle(0, 0, 10, 10);
       System.out.println(rect1.getLocation());
       rect1.translate(10, 0);
       System.out.println(rect1.getLocation());
       rect1.translate(10, 10);
       System.out.println(rect1.getLocation());
       rect1.translate(0, -10);
       System.out.println(rect1.getLocation());
    }
}