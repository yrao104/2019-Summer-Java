import javafx.animation.PathTransition;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.image.ImageView; 
import javafx.scene.layout.Pane; 
import javafx.scene.shape.Line; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
import javafx.scene.shape.Rectangle; 
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.animation.Timeline;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import java.awt.Point;

public class FlagRisingAnimation extends Application{ 
    private Rectangle rect;
    private boolean collision;
    @Override // Override the start method in the Application class 
    public void start(Stage primaryStage) { 
        // Create a pane 
        BorderPane borderPane = new BorderPane();

        // Add an image view and add it to pane 
        ImageView imageView = new ImageView("image/us.gif"); 
        borderPane.setCenter(imageView); 

        double xval = imageView.getX();
        double yval = imageView.getY();

        Chicken chicken = new Chicken();
        borderPane.setRight(chicken);
        
        collision = false;
        
        // Create a path transition 
        Line line = new Line(125, 200, 125, 0);

        PathTransition pt = new PathTransition(Duration.millis(10000),
                line, imageView); 
        pt.setCycleCount(Timeline.INDEFINITE); 
        pt.play(); // Start animation 

        class getValues extends TimerTask {
            public void run() {
                /*rect = new Rectangle(chicken.getX(), chicken.getY(), 22.5, 60);
                rb = rect.getBounds();
                if(imageView.intersects(rect)){
                System.out.print("Yay");
                }
                else{
                System.out.print("\n:(");
                }*/

                Point2D poind = line.localToParent(125, 0);

                double x1 = poind.getX();
                double y1 = poind.getY();

                x1 = pt.getNode().getTranslateX();
                y1 = pt.getNode().getTranslateY();
                double x2 = chicken.getX();
                double y2 = chicken.getY();

                //System.out.println("Image: " + x1 + ", " + y1);
                //System.out.println("Chicken: " + x2 + ", " + y2);

                if(Math.abs(x1 - x2) <= 320 && Math.abs(y1 - y2) <=280){
                    System.out.println("COLLISION");
                    collision = true;
                }
                else{
                    //System.out.println("WAAAAAA"); 
                }
                /*
                //Rectangle r1 = new Rectangle(chicken.getX(), chicken.getY(), chicken.getWidth(), chicken.getHeight());
                //Rectangle r2 = new Rectangle(imageView.getX(), imageView.getY(), imageView.getFitWidth(), imageView.getFitHeight());

                int ch = (int)chicken.getHeight();
                int cw = (int)chicken.getWidth();
                int ih = (int)imageView.getFitHeight();
                int iw = (int)imageView.getFitWidth();

                double x1 = pt.getNode().getTranslateX();
                double y1 = pt.getNode().getTranslateY();

                Point left1 = new Point((int)chicken.getX(), (int)chicken.getY() + ch);
                Point right1 = new Point((int)chicken.getX() + cw, (int)chicken.getY());

                Point left2 = new Point((int)x1, (int)y1 + ih);
                Point right2 = new Point((int)x1 + iw, (int)y1);

                System.out.println("Chicken points: " + (int)chicken.getX() + ", " + (int)chicken.getY());
                System.out.println("Image points: " + (int)x1 + ", " + (int)y1);

                Rectangle first = new Rectangle(left1, right1);
                Rectangle second = new Rectangle(left2, right2);

                if(first.isOverLapping(second)){
                //borderPane.setAlignment(chicken, null);
                System.out.println("Collision");
                }
                else{
                System.out.println(":(");
                }

                }

                class Rectangle { 
                private final Point topLeft; 
                private final Point bottomRight; 
                public Rectangle(Point topLeft, Point bottomRight) { 
                this.topLeft = topLeft; 
                this.bottomRight = bottomRight; } 
                 */
                /**
                 * Java method to check if two rectangle are intersecting to each other. 
                 * 
                 * @param other 
                 * @return true if two rectangle overlap with each other 
                 */ 
                /*public boolean isOverLapping(Rectangle other) { 
                if (this.topLeft.x > other.bottomRight.x // R1 is right to R2 
                || this.bottomRight.x < other.topLeft.x // R1 is left to R2 
                || this.topLeft.y < other.bottomRight.y // R1 is above R2 
                || this.bottomRight.y > other.topLeft.y) { // R1 is below R1 
                return false; 
                } 
                else{
                return true; 
                }
                }*/
            }
        }

        // Create a scene and place it in the stage 
        Scene scene = new Scene(borderPane, 250, 200); 
        primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title 
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if(event.getCode() == KeyCode.UP){
                        chicken.up();
                        // And From your main() method or any other method
                        if(collision == false){
                            Timer timer = new Timer();
                            timer.schedule(new getValues(), 0, 5000);
                        }
                        //borderPane.setTranslateY(y);
                        //terraina.createTerrain(3);
                    }
                    else if(event.getCode() == KeyCode.LEFT){    
                        chicken.left();
                        // And From your main() method or any other method
                        if(collision == false){
                            Timer timer = new Timer();
                            timer.schedule(new getValues(), 0, 5000);
                        }
                    }
                    else if(event.getCode() == KeyCode.RIGHT){
                        chicken.right();
                        // And From your main() method or any other method
                        if(collision == false){
                            Timer timer = new Timer();
                            timer.schedule(new getValues(), 0, 5000);
                        }
                    }

                }
            });

        chicken.requestFocus();
    } 
}