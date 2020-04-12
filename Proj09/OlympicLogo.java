
/**
 * Write a description of class OlympicLogo here.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class OlympicLogo extends Circle
{
    //instance variables
    private int ringThickness;
    
    public OlympicLogo(double cx, double cy, double radius){
        super(cx, cy, radius);
        ringThickness = (int)(radius / 15); 
    }
    
    public void draw(Graphics2D g2){
        Color blue = new Color(0, 153, 230);
        Color red = new Color(255, 77, 77);
        Color green = new Color(0, 153, 0);
        Color yellow = new Color(255, 187, 51);
        g2.setStroke(new BasicStroke(ringThickness));
        g2.setPaint(blue);
        super.draw(g2);
        super.translate(super.getRadius() * 1.2, 0);
        g2.setColor(Color.black);
        super.draw(g2);
        super.translate(super.getRadius() * 1.2, 0);
        g2.setPaint(red);
        super.draw(g2);
        super.translate(-super.getRadius() * 0.6, super.getRadius() * 0.5);
        g2.setPaint(green);
        super.draw(g2);
        super.translate(-super.getRadius() * 1.2, 0);
        g2.setPaint(yellow);
        super.draw(g2);
    }
}
