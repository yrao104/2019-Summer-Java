
/**
 * This class represents a circle.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

import java.awt.Graphics2D;

public class Circle extends java.awt.geom.Ellipse2D.Double
{
    //constructors
    public Circle(double cx, double cy, double radius){
        x = cx;
        y = cy;
        width = radius;
        height = radius;
    }
    
    //methods
    public double getRadius(){
        return width;
    }
    
    public void draw(Graphics2D g2){
        g2.draw(this);
    }
    
    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }
}
