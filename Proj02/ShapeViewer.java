import javax.swing.JFrame;

public class ShapeViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(370, 300);
      frame.setTitle("Stallion");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      ShapeComponent component = new ShapeComponent();
      frame.add(component);

      frame.setVisible(true);
   }
}
