import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws a few cars.
 * @author C. Horstmann, modified by A. Nguyen
 * @version 2.0
*/
public class CarComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      /* Rather than having the code to directly draw a car here
       * (by using Rectangle, Ellipse2D.Double, etc.), we take
       * the code & put it in a separate class called Car. This way, 
       * we can display as many cars as possible, by simply creating
       * "new" car, at various location (x, y).
       */

      // Draw a car at the top-left corner
      int carLen = 60;               // the length of the car
      Car car1 = new Car(0, 0, carLen);
      car1.draw(g2);
      
      
      // Coordinates of bottom-right corner
      int right = getWidth(); // the width of the view
      int bot = getHeight();  // the height of the view
      
      // Draw a car randomly in the middle third (vertically)
      carLen = 120;                  // the length of the car - note: do NOT declare again
      Random randGen = new Random(); // create object for random number generator
      
      int x = randGen.nextInt(right - carLen);
      int y = randGen.nextInt(bot/3) + bot/3 - carLen/2;

      Car car2 = new Car(x, y, carLen);
      car2.draw(g2);      
      
      // Draw a car at the bottom-right corner
      carLen = 200;               // the length of the car - note: do NOT declare again
      x = getWidth() - carLen;    
      y = getHeight() - carLen/2; 
      Car car3 = new Car(x, y, carLen);
      car3.draw(g2);      

      // Draw 4 stars
      Star star1 = new Star(randGen.nextInt(30), randGen.nextInt(120), 15, 15); // at random location
      Star star2 = new Star(190, 100, 12, 12);
      Star star3 = new Star(220, 200, 10, 10);
      Star star4 = new Star(70, 240, 8, 8);
      
      star1.draw(g2);
      star2.draw(g2);
      star3.draw(g2);
      star4.draw(g2);
      
      // Draw 3 men randomly 
      Man man1 = new Man(100, 20, 50);
      man1.draw(g2);
      Man man2 = new Man(350, 50, 100);
      man2.draw(g2);
      Man man3 = new Man(150, 200, 30);
      man3.draw(g2);
   }
}
