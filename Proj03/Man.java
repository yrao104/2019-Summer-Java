import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This class is for a simple man (including drawing) that can be positioned anywhere on the screen,
 * and of any size.
 * 
 * @author C. Horstmann, modified by Y. Rao
 * @verion 1.0
*/
public class Man
{
   private int xLeft;
   private int yTop;
   private int delta;

   /**
      Constructs a stick figure man with a given top left corner.
      @param x the x coordinate of the top left corner
      @param y the y coordinate of the top left corner
      @param approxLen the approximate length of the man; the man's height if half of the length
   */
   public Man(int x, int y, int approxLen)
   {
      xLeft = x;
      yTop = y;
      delta = approxLen;
   }

   /**
      Draws the man.
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      // The man's head
       Ellipse2D.Double head = new Ellipse2D.Double(xLeft, yTop, delta/2, delta/2);      
      
      // The man's body
      Rectangle body = new Rectangle(xLeft + delta/4, yTop + delta/2, 1, delta/2);
      
      //The man's legs
      Line2D.Double leg1 = new Line2D.Double(xLeft + delta/4, yTop + delta, xLeft + delta/2, yTop + delta + delta/4);
      Line2D.Double leg2 = new Line2D.Double(xLeft + delta/4, yTop + delta, xLeft, yTop + delta + delta/4);

      // The man's arms
      Rectangle arms = new Rectangle(xLeft, yTop + delta/2 + delta/4, delta/2, 1);
      
      // The  eyes
      Ellipse2D.Double eye1 = new Ellipse2D.Double(xLeft + delta/8, yTop + delta/6, 2, 2);
      Ellipse2D.Double eye2 = new Ellipse2D.Double(xLeft + delta/8 + delta/4, yTop + delta/6, 2, 2);
      
      // The  mouth
      Rectangle mouth = new Rectangle(xLeft + delta/8, yTop + 2*(delta/6), delta/4, 1);
      
     // Draw the entire man
      g2.draw(head);
      g2.draw(body);
      g2.fill(body);
      g2.draw(leg1);
      g2.draw(leg2);      
      g2.draw(arms);
      g2.fill(arms);
      g2.draw(eye1);
      g2.draw(eye2);      
      g2.draw(mouth);
      g2.fill(eye1);
      g2.fill(eye2);      
      g2.fill(mouth); 
   }
}
