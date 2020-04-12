import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Polygon;
import java.awt.Color;
import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.GradientPaint;

public class ShapeComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      // Show the boundary for the image
      g2.setColor(Color.BLACK);
      Rectangle boundary = new Rectangle(0, 0, 370, 300);
      g2.draw(boundary);//rectangle boundary
      
      //Background
      g2.setStroke(new BasicStroke(5));
      Color grassyGreen = new Color(0, 153, 0);
      g2.setColor(grassyGreen); 
      boundary.translate(0, 250);
      boundary.grow(0, -250);
      g2.fillRect(0, 250, 370, 50);//for grass
      
      Color sunset1 = new Color(255, 235, 153);
      Color sunset2 = new Color(204, 82, 0);
      GradientPaint sunset = new GradientPaint(0, 250, sunset1, 0, 0, sunset2);
      g2.setPaint(sunset);
      boundary.grow(0, -100);
      g2.fillRect(0, 0, 370, 250);//for sky
      
      
      // Prepare some colors from scratch 
      Color color1 = new Color(242, 230, 217); 
      Color color2 = new Color(229, 205, 179); 
      Color color3 = new Color(216, 180, 141);
      Color color4 = new Color(203, 155, 103); 
      Color color5 = new Color(190, 130, 65);
      Color color6 = new Color(152, 104, 52); 
      Color color7 = new Color(114, 78, 39); 
      
      // Construct a few shapes
      Rectangle box1 = new Rectangle(5, 10, 200, 300);
      Ellipse2D.Double oval1 = new Ellipse2D.Double(150, 250, 100, 50);
      
      // Construct a line
      Line2D.Double aLine = new Line2D.Double(50, 100, 95, 75);

      // Construct polygons for color1
      g2.setColor(color1);
      
      int[] x1 = {150, 150, 140};
      int[] y1 = {80, 105, 110};
      Polygon p1 = new Polygon(x1, y1, 3);
      g2.fillPolygon(p1);
      
      int[] x2 = {140, 150, 140, 150};
      int[] y2 = {125, 130, 140, 140};
      Polygon p2 = new Polygon(x2, y2, 4);
      g2.fillPolygon(p2);
      
      int[] x3 = {185, 195, 170, 170, 220};
      int[] y3 = {100, 100, 140, 160, 160};
      Polygon p3 = new Polygon(x3, y3, 5);
      g2.fillPolygon(p3);
      
      int[] xfix4 = {170, 170, 175, 185, 200, 220};
      int[] yfix4 = {160, 140, 110, 100, 100, 170};
      Polygon pfix4 = new Polygon(xfix4, yfix4, 6);
      g2.fillPolygon(pfix4);
      
      int[] xfix8 = {140, 150, 150, 140};
      int[] yfix8 = {140, 140, 130, 125};
      Polygon pfix8 = new Polygon(xfix8, yfix8, 4);
      g2.fillPolygon(pfix8);
      
      // Construct polygons for color2
      g2.setColor(color2);
      
      int[] x4 = {185, 185, 200, 215, 220, 220};
      int[] y4 = {220, 230, 240, 230, 225, 215};
      Polygon p4 = new Polygon(x4, y4, 6);
      g2.fillPolygon(p4);
      
      int[] x5 = {185, 185, 220, 240};
      int[] y5 = {160, 200, 160, 200};
      Polygon p5 = new Polygon(x5, y5, 4);
      g2.fillPolygon(p5);
      
      int[] xfix3 = {185, 185, 220, 240};
      int[] yfix3 = {227, 160, 160, 200};
      Polygon pfix3 = new Polygon(xfix3, yfix3, 4);
      g2.fillPolygon(pfix3);
      
      int[] xfix22 = {170, 190, 175, 170};
      int[] yfix22 = {160, 160, 115, 140};
      Polygon pfix22 = new Polygon(xfix22, yfix22, 4);
      g2.fillPolygon(pfix22);
      
      //Construct polygons for color3
      g2.setColor(color3);
      int[] x6 = {50, 30, 65, 65};
      int[] y6 = {240, 300, 300, 260};
      Polygon p6 = new Polygon(x6, y6, 4);
      g2.fillPolygon(p6);
      
      int[] x7 = {130, 140, 165, 170};
      int[] y7 = {70, 70, 55, 60};
      Polygon p7 = new Polygon(x7, y7, 4);
      g2.fillPolygon(p7);
      
      int[] x8 = {190, 190, 210, 205};
      int[] y8 = {60, 40, 20, 40};
      Polygon p8 = new Polygon(x8, y8, 4);
      g2.fillPolygon(p8);
      
      int[] x9 = {140, 140, 170, 170, 185, 185, 185, 185};
      int[] y9 = {140, 150, 140, 160, 160, 210, 205, 190};
      Polygon p9 = new Polygon(x9, y9, 8);
      g2.fillPolygon(p9);
      
      int[] x10 = {185, 185, 195, 200, 185};
      int[] y10 = {210, 200, 205, 220, 220};
      Polygon p10 = new Polygon(x10, y10, 5);
      g2.fillPolygon(p10);
      
      int[] x11 = {195, 205, 240, 240, 215};
      int[] y11 = {205, 200, 200, 210, 215};
      Polygon p11 = new Polygon(x11, y11, 5);
      g2.fillPolygon(p11);
      
      int[] xfix6 = {140, 140, 150, 170, 170, 185, 185, 180, 180};
      int[] yfix6 = {150, 140, 140, 140, 160, 160, 210, 205, 190};
      Polygon pfix6 = new Polygon(xfix6, yfix6, 9);
      g2.fillPolygon(pfix6);
      
      int[] xfix17 = {130, 145, 165, 170, 170, 165};
      int[] yfix17 = {70, 70, 230, 65, 60, 50, 50};
      Polygon pfix17 = new Polygon(xfix17, yfix17, 6);
      g2.fillPolygon(pfix17);
      
      //Construct polygons for color4
      g2.setColor(color4);
      int[] x12 = {65, 50, 65, 70};
      int[] y12 = {205, 240, 260, 210};
      Polygon p12 = new Polygon(x12, y12, 4);
      g2.fillPolygon(p12);
      
      int[] x13 = {60, 60, 100, 85};
      int[] y13 = {135, 120, 100, 135};
      Polygon p13 = new Polygon(x13, y13, 4);
      g2.fillPolygon(p13);
      
      int[] x14 = {110, 120, 130, 165, 140};
      int[] y14 = {60, 70, 70, 55, 50};
      Polygon p14 = new Polygon(x14, y14, 5);
      g2.fillPolygon(p14);
      
      int[] x15 = {135, 140, 135, 140, 150, 150};
      int[] y15 = {50, 50, 30, 30, 60, 8};
      Polygon p15 = new Polygon(x15, y15, 6);
      g2.fillPolygon(p15);
      
      int[] x16 = {160, 165, 170};
      int[] y16 = {35, 50, 50};
      Polygon p16 = new Polygon(x16, y16, 3);
      g2.fillPolygon(p16);
      
      int[] x17 = {150, 170, 185, 175, 175};
      int[] y17 = {80, 60, 100, 110, 80};
      Polygon p17 = new Polygon(x17, y17, 5);
      g2.fillPolygon(p17);
      
      int[] x18 = {150, 150, 175, 170};
      int[] y18 = {140, 120, 110, 140};
      Polygon p18 = new Polygon(x18, y18, 4);
      g2.fillPolygon(p18);
      
      int[] x19 = {240, 220, 215, 210};
      int[] y19 = {240, 230, 240, 245};
      Polygon p19 = new Polygon(x19, y19, 4);
      g2.fillPolygon(p19);
      
      int[] x20 = {235, 240, 240, 235};
      int[] y20 = {205, 210, 225, 225};
      Polygon p20 = new Polygon(x20, y20, 4);
      g2.fillPolygon(p20);
      
      int[] xfix1 = {201, 204, 215, 225, 210};
      int[] yfix1 = {240, 245, 240, 225, 230};
      Polygon pfix1 = new Polygon(xfix1, yfix1, 5);
      g2.fillPolygon(pfix1);
      
      int[] xfix5 = {210, 219, 220};
      int[] yfix5 = {94, 97, 110};
      Polygon pfix5 = new Polygon(xfix5, yfix5, 3);
      g2.fillPolygon(pfix5);
      
      int[] xfix18 = {140, 135, 137, 140, 150, 150};
      int[] yfix18 = {50, 50, 25, 25, 8, 12};
      Polygon pfix18 = new Polygon(xfix18, yfix18, 6);
      g2.fillPolygon(pfix18);
      
      //Construct polygons for color5
      g2.setColor(color5);
      int[] x21 = {0, 0, 60, 25};
      int[] y21 = {300, 250, 200, 300};
      Polygon p21 = new Polygon(x21, y21, 4);
      g2.fillPolygon(p21);
      
      int[] x22 = {20, 35, 25, 35};
      int[] y22 = {220, 205, 210, 215};
      Polygon p22 = new Polygon(x22, y22, 4);
      g2.fillPolygon(p22);
      
      int[] x23 = {65, 70, 80, 85, 80, 120, 100, 120};
      int[] y23 = {275, 210, 170, 170, 250, 85, 170, 120};
      Polygon p23 = new Polygon(x23, y23, 8);
      g2.fillPolygon(p23);
      
      int[] x24 = {100, 105, 115, 100, 105, 115, 145, 125, 125};
      int[] y24 = {300, 230, 225, 225, 150, 130, 205, 200, 235};
      Polygon p24 = new Polygon(x24, y24, 9);
      g2.fillPolygon(p24);
      
      int[] x25 = {45, 50, 70, 55};
      int[] y25 = {165, 145, 145, 165};
      Polygon p25 = new Polygon(x25, y25, 4);
      g2.fillPolygon(p25);
      
      int[] x26 = {150, 145, 155};
      int[] y26 = {12, 35, 35};
      Polygon p26 = new Polygon(x26, y26, 3);
      g2.fillPolygon(p26);
      
      int[] x27 = {160, 140, 165};
      int[] y27 = {35, 50, 50};
      Polygon p27 = new Polygon(x27, y27, 3);
      g2.fillPolygon(p27);
      
      int[] x28 = {150, 190, 200};
      int[] y28 = {40, 60, 65};
      Polygon p28 = new Polygon(x28, y28, 3);
      g2.fillPolygon(p28);
      
      int[] x29 = {135, 180, 180};
      int[] y29 = {145, 205, 190};
      Polygon p29 = new Polygon(x29, y29, 3);
      g2.fillPolygon(p29);
      
      int[] x30 = {140, 175, 175, 150, 150, 140};
      int[] y30 = {120, 110, 80, 80, 105, 110};
      Polygon p30 = new Polygon(x30, y30, 6);
      g2.fillPolygon(p30);
      
      int[] x31 = {170, 180, 190, 190, 215, 220, 220, 200, 185, 170};
      int[] y31 = {50, 50, 60, 65, 100, 110, 170, 100, 100, 60};
      Polygon p31 = new Polygon(x31, y31, 10);
      g2.fillPolygon(p31);
      
      int[] x32 = {220, 235, 235, 225};
      int[] y32 = {225, 225, 205, 215};
      Polygon p32 = new Polygon(x32, y32, 4);
      g2.fillPolygon(p32);
      
      int[] x33 = {210, 215, 240, 215, 220};
      int[] y33 = {245, 240, 240, 250, 255};
      Polygon p33 = new Polygon(x33, y33, 5);
      g2.fillPolygon(p33);
      
      Ellipse2D.Double ellipse1 = new Ellipse2D.Double(195, 205, 17, 22);
      g2.draw(ellipse1);
      g2.fill(ellipse1);
      
      int[] xfix2 = {220, 235, 235, 217};
      int[] yfix2 = {215, 205, 225, 230};
      Polygon pfix2 = new Polygon(xfix2, yfix2, 4);
      g2.fillPolygon(pfix2);
      
      int[] xfix9 = {100, 100, 115, 105, 105};
      int[] yfix9 = {300, 225, 225, 230, 260};
      Polygon pfix9 = new Polygon(xfix9, yfix9, 5);
      g2.fillPolygon(pfix9);
      
      int[] xfix10 = {65, 65, 70, 80, 85, 120, 120, 115, 105, 100, 85, 80};
      int[] yfix10 = {275, 260, 210, 170, 170, 85, 115, 130, 150, 170, 240, 250};
      Polygon pfix10 = new Polygon(xfix10, yfix10, 12);
      g2.fillPolygon(pfix10);
      
      int[] xfix13 = {25, 20, 25, 35, 35};
      int[] yfix13 = {230, 220, 210, 205, 215};
      Polygon pfix13 = new Polygon(xfix13, yfix13, 5);
      g2.fillPolygon(pfix13);
      
      int[] xfix20 = {185, 190, 205};
      int[] yfix20 = {60, 70, 40};
      Polygon pfix20 = new Polygon(xfix20, yfix20, 3);
      g2.fillPolygon(pfix20);
      
      //Construct polygons for color6
      g2.setColor(color6);
      int[] x34 = {25, 30, 60, 65};
      int[] y34 = {300, 250, 200, 205};
      Polygon p34 = new Polygon(x34, y34, 4);
      g2.fillPolygon(p34);
      
      int[] x35 = {65, 65, 105, 100, 115, 100, 100, 100};
      int[] y35 = {300, 275, 150, 225, 225, 230, 260, 300};
      Polygon p35 = new Polygon(x35, y35, 8);
      g2.fillPolygon(p35);
      
      int[] x36 = {115, 120, 135, 135, 120};
      int[] y36 = {130, 120, 85, 145, 85};
      Polygon p36 = new Polygon(x36, y36, 5);
      g2.fillPolygon(p36);
      
      int[] x37 = {180, 215, 210, 190, 190};
      int[] y37 = {50, 15, 20, 40, 60, 130};
      Polygon p37 = new Polygon(x37, y37, 5);
      g2.fillPolygon(p37);
      
      int[] x38 = {215, 225, 240, 240};
      int[] y38 = {240, 225, 225, 240};
      Polygon p38 = new Polygon(x38, y38, 4);
      g2.fillPolygon(p38);
      
      int[] x39 = {10, 15, 10, 40, 30, 70, 80, 80, 35, 35, 25, 20, 25};
      int[] y39 = {230, 220, 210, 190, 190, 145, 145, 160, 215, 205, 210, 220, 225};
      Polygon p39 = new Polygon(x39, y39, 13);
      g2.fillPolygon(p39);
      
      int[] x40 = {70, 50, 40, 60, 60, 85, 80};
      int[] y40 = {145, 145, 145, 120, 135, 135, 145};
      Polygon p40 = new Polygon(x40, y40, 7);
      g2.fillPolygon(p40);
      
      int[] x41 = {60, 35, 95, 60, 80, 110, 120, 100, 110, 100};
      int[] y41 = {120, 120, 85, 120, 80, 60, 70, 80, 85, 95};
      Polygon p41 = new Polygon(x41, y41, 7);
      g2.fillPolygon(p41);
      
      int[] x42 = {110, 120, 115, 130, 135, 165};
      int[] y42 = {60, 50, 40, 40, 80, 50, 50};
      Polygon p42 = new Polygon(x42, y42, 6);
      g2.fillPolygon(p42);
      
     g2.fillOval(199, 206, 9, 10);
     
     int[] xfix7 = {115, 120, 120, 135, 150, 140, 140, 135};
      int[] yfix7 = {130, 115, 85, 85, 80, 110, 150, 145};
      Polygon pfix7 = new Polygon(xfix7, yfix7, 8);
      g2.fillPolygon(pfix7);
      
      int[] xfix11 = {25, 60, 65, 50, 35};
      int[] yfix11 = {300, 200, 205, 240, 300};
      Polygon pfix11 = new Polygon(xfix11, yfix11, 5);
      g2.fillPolygon(pfix11);
      
      int[] xfix14 = {80, 80, 85};
      int[] yfix14 = {160, 145, 135};
      Polygon pfix14 = new Polygon(xfix14, yfix14, 3);
      g2.fillPolygon(pfix14);
      
      int[] xfix15 = {60, 35, 95, 115, 100};
      int[] yfix15 = {120, 120, 85, 80, 100};
      Polygon pfix15 = new Polygon(xfix15, yfix15, 5);
      g2.fillPolygon(pfix15);
      
      int[] xfix16 = {135, 150, 170};
      int[] yfix16 = {85, 80, 60};
      Polygon pfix16 = new Polygon(xfix16, yfix16, 3);
      g2.fillPolygon(pfix16);
      
      int[] xfix19 = {180, 215, 210, 210, 190, 190};
      int[] yfix19 = {50, 12, 30, 25, 45, 60};
      Polygon pfix19 = new Polygon(xfix19, yfix19, 6);
      g2.fillPolygon(pfix19);
      
      int[] xfix21 = {125, 145, 120};
      int[] yfix21 = {200, 205, 145};
      Polygon pfix21 = new Polygon(xfix21, yfix21, 3);
      g2.fillPolygon(pfix21);
      
      //Construct polygons for color7
      g2.setColor(color7);
      int[] x43 = {100, 125, 125, 145, 120, 115, 135, 180, 185, 185, 185, 155, 155};
      int[] y43 = {300, 235, 200, 205, 145, 130, 145, 205, 210, 220, 230, 215, 300};
      Polygon p43 = new Polygon(x43, y43, 13);
      g2.fillPolygon(p43);
      
      int[] x44 = {205, 205, 210, 230, 240, 215, 215, 215};
      int[] y44 = {245, 255, 260, 260, 240, 250, 255, 240};
      Polygon p44 = new Polygon(x44, y44, 8);
      g2.fillPolygon(p44);
      
      int[] x45 = {155, 140, 140, 150, 145};
      int[] y45 = {35, 50, 30, 12, 35};
      Polygon p45 = new Polygon(x45, y45, 5);
      g2.fillPolygon(p45);
      
      int[] x46 = {130, 130, 150, 150, 137, 135};
      int[] y46 = {50, 25, 3, 8, 25, 50};
      Polygon p46 = new Polygon(x46, y46, 6);
      g2.fillPolygon(p46);
      
      int[] x47 = {165, 145, 130, 120, 100, 110, 100, 85, 80, 35, 25, 60, 70, 80, 85, 120, 135};
      int[] y47 = {65, 70, 70, 70, 80, 85, 100, 135, 160, 215, 225, 200, 210, 170, 170, 85, 85};
      Polygon p47 = new Polygon(x47, y47, 17);
      g2.fillPolygon(p47);
      
      int[] xfix12 = {60, 30, 25, 15};
      int[] yfix12 = {200, 230, 230, 230};
      Polygon pfix12 = new Polygon(xfix12, yfix12, 4);
      g2.fillPolygon(pfix12);
      
      g2.fillOval(137, 111, 20, 13);
      g2.setColor(Color.WHITE);
      g2.fillOval(140, 115, 3, 4);
      
      //Rectangle behind quote
      boundary.grow(-250, -200);
      boundary.translate(230, 110);
      g2.setColor(Color.WHITE);
      g2.draw(boundary);
      g2.fillRect(235, 95, 130, 80);
      
      //Text
      g2.setColor(Color.BLACK);
      g2.drawString("To ride on a horse", 255, 120);
      g2.drawString(" is to fly without wings", 240, 140);
      g2.drawString(" - Anonymous", 260, 160);
      
      //Line Frame
      g2.setStroke(new BasicStroke(3));
      g2.drawLine(240, 100, 360, 100);
      g2.drawLine(240, 170, 360, 170);
   }
}
