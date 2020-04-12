import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * This component draws a few cars.
 * @author C. Horstmann, modified by A. Nguyen
 * @version 2.0
*/
public class OlympicComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      OlympicLogo logo1 = new OlympicLogo(50, 50, 50);
      logo1.draw(g2);
      
      OlympicLogo logo2 = new OlympicLogo(100, 300, 120);
      logo2.draw(g2);
      
      OlympicLogo logo3 = new OlympicLogo(400, 25, 30);
      logo3.draw(g2);
   }
}
