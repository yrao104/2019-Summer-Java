import javax.swing.JFrame;

public class OlympicViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 400);
      frame.setTitle("3 Olympic Logos");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      OlympicComponent component = new OlympicComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}