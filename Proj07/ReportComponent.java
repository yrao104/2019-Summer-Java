import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.geom.Ellipse2D;
import java.awt.BasicStroke;
import java.awt.GradientPaint;
import java.awt.Polygon;
import java.awt.geom.Line2D;

/**
   This component draws stars.
*/
public class ReportComponent extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;
      
      // The following is for you to place things in the right place
      // Delete these rectangles before you finalize your image
      
      g2.setColor(Color.LIGHT_GRAY);
      g2.draw(new Rectangle(0, 0, 480, 700)); // paper
      g2.draw(new Rectangle(0, 450, 480, 250)); // leave this area blank (for teacher)
      
      
      // Show image at top-right area
      BufferedImage img = null; 
      try {

          img = ImageIO.read(new File("C:/Users/Yamuna/Desktop/Stallion.png")); // specify file name of the image here
          //img = ImageIO.read(new File("C:/Users/!cmfatdp/Desktop/Stallion.png"));
        } 
        catch (IOException e) { 
      }

        Image newImage = img.getScaledInstance(220, 178, Image.SCALE_DEFAULT);
        int x = 250, y = 10;
        if (img != null && g2.drawImage(newImage, x, y, null));

      g2.setColor(Color.BLACK);
      /*Rectangle boundary = new Rectangle(10, 10, 220, 178);
      g2.draw(boundary);//rectangle boundary*/
      
      //atdp logo
      g2.setStroke(new BasicStroke(2));
      //gradient background for atdp logo
      Color sunset1 = new Color(204, 0, 82);
      Color sunset2 = new Color(255, 204, 102);
      GradientPaint sunset = new GradientPaint(45, 24, sunset1, 45, 174, sunset2);
      g2.setPaint(sunset);
      int[] x1 = {73, 168, 220, 168, 73, 20};
      int[] y1 = {14, 14, 99, 184, 184, 99};
      Polygon p1 = new Polygon(x1, y1, 6);
      g2.fillPolygon(p1);
      
      g2.setColor(Color.BLACK);
      Ellipse2D.Double oval1 = new Ellipse2D.Double(60, 87, 30, 30);
      Ellipse2D.Double oval2 = new Ellipse2D.Double(65, 92, 20, 20);
      g2.draw(oval1);
      g2.draw(oval2);
      g2.fill(oval1);
      Color sunset3 = new Color(255, 102, 102);
      Color sunset4 = new Color(255, 136, 77);
      GradientPaint sunset5 = new GradientPaint(45, 92, sunset3, 45, 112, sunset4);
      g2.setPaint(sunset5);
      g2.fill(oval2);
      g2.setColor(Color.BLACK);
      Rectangle rect1 = new Rectangle(85, 87, 5, 30);
      g2.draw(rect1);
      g2.fill(rect1);
      Rectangle rect2 = new Rectangle(100, 77, 5, 40);
      g2.draw(rect2);
      g2.fill(rect2);
      Rectangle rect3 = new Rectangle(95, 87, 15, 5);
      g2.draw(rect3);
      g2.fill(rect3);
      Ellipse2D.Double oval3 = new Ellipse2D.Double(115, 87, 30, 30);
      g2.draw(oval3);
      g2.fill(oval3);
      Ellipse2D.Double oval4 = new Ellipse2D.Double(120, 92, 20, 20);
      g2.draw(oval4);
      g2.setPaint(sunset5);
      g2.fill(oval4);
      g2.setColor(Color.BLACK);
      Rectangle rect4 = new Rectangle(140, 67, 5, 50);
      g2.draw(rect4);
      g2.fill(rect4);
      Ellipse2D.Double oval5 = new Ellipse2D.Double(153, 87, 30, 30);
      g2.draw(oval5);
      g2.fill(oval5);
      Ellipse2D.Double oval6 = new Ellipse2D.Double(158, 92, 20, 20);
      g2.draw(oval6);
      g2.setPaint(sunset5);
      g2.fill(oval6);
      g2.setColor(Color.BLACK);
      Rectangle rect6 = new Rectangle(153, 87, 5, 50);
      g2.draw(rect6);
      g2.fill(rect6);
      
      //Text
      g2.setColor(Color.BLACK);
      g2.drawString("Course: SD 3735.2 - Programming in Java", 20, 260);
      g2.drawString("Grade Report, 07/10/2019", 20, 280);
      g2.drawString("Student: Yamuna Rao", 20, 300);
      g2.drawString("Parent Signature: ", 30, 380);
      g2.drawString("Date: ", 330, 380);
      g2.setStroke(new BasicStroke(1));
      Line2D.Double aLine = new Line2D.Double(320, 360, 320, 390);
      g2.draw(aLine);
      Rectangle boundary = new Rectangle(20, 360, 440, 30);
      g2.draw(boundary);
      
      //Calculate Grade
      double grade = 99.17;
      String letterGrade;
      if(grade >= 94){
          letterGrade = "A";
      }
      else if(grade >= 90){
          letterGrade = "A-";
      }
      else if(grade >= 87){
          letterGrade = "B+";
      }
      else if(grade >= 84){
          letterGrade = "B";
      }
      else if(grade >= 80){
          letterGrade = "B-";
      }
      else if(grade >= 10){
          letterGrade = "PASS";
      }
      else{
          letterGrade = "NO PASS";
      }
      
      //Print grade
      g2.drawString("Grade: " + letterGrade, 20, 320); 
      
      //Print comments from teacher
      g2.drawString("Comments from teacher: ", 20, 500);
      Rectangle boundary1 = new Rectangle(20, 520, 440, 150);
      g2.draw(boundary1);
      g2.drawString("   Yamuna is very attentive during the lessons, asborbing everything. And she ", 30, 540);
      g2.drawString("has already developed good work habits in systematically planning out the ", 30, 560); 
      g2.drawString("design before coding. All of this is evident in her high grade. She has learnt so ", 30, 580);
      g2.drawString("much; even after just one week, she programmed to create an impressive ", 30, 600); 
      g2.drawString("second-prize image of \"Stallion\".", 30, 620); 
   }
}