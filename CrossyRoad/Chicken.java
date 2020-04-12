import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import javafx.scene.image.ImageView;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;

/**
 * This class represents the chicken character in the game.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

class Chicken extends Pane {
    //instance variables
    private ImageView chicken = new ImageView("images/Chicken.png"); 
    private ImageView deadChicken = new ImageView("images/DeadChicken.png");
    private int y;
    private Terrain terraina;
    private int x1 = 5;
    private int x2 = 5;

    //constructors
    /**
     * Constructor for objects of class Chicken
     */
    public Chicken(Terrain terraina) { 
        //chicken.setX(-140);
        chicken.setX(250);
        chicken.setY(545);
        getChildren().add(chicken);
        this.terraina = terraina;
    }

    /**
     * Moves the chicken forward
     */
    public int up() { 
        terraina.createTerrain(1);
        chicken.setY((chicken.getY() - 25));
        chicken.setX((chicken.getX() + 0));
        Timeline timeline = new Timeline(new KeyFrame(
                    Duration.millis(100),
                    ae -> chicken.setY((chicken.getY() + 5))));
        timeline.play(); 
        y+=20;
        return y;
    } 

    /**
     * Moves the chicken right until the chicken goes off the screen.
     */ 
    public void right() {
        x1 = 5;
        if(chicken.getX() < 500){
            chicken.setX((chicken.getX() +  20));
            Timeline timeline = new Timeline(new KeyFrame(
                        Duration.millis(100),
                        ae -> chicken.setY((chicken.getY() + x1))));
            timeline.play(); 
            x1+=1;
        }
    }

    /**
     * Moves the chicken left until the chicken goes off the screen.
     */
    public void left() {
        x2 = 5;
        if(chicken.getX() > 0){
            chicken.setY(chicken.getY() - x2);
            //chicken.setY(chicken.getY() + 0 - x2);
            Timeline timeline = new Timeline(new KeyFrame(
                        Duration.millis(100),
                        ae -> chicken.setX((chicken.getX() - 20))));
            timeline.play();
            x2+=1;
        }
    }

    /**
     * Returns the chicken object 
     * @return chicken The chicken object
     */
    public ImageView getChicken(){
        return chicken;
    }

    /**
     * Returns the x-value of the chicken 
     * @return chicken.getX() The x-value of the chicken
     */
    public double getX(){
        return chicken.getX();
    }

    /**
     * Returns the y-value of the chicken 
     * @return chicken.getY() The y-value of the chicken
     */
    public double getY(){
        return chicken.getY();
    }

    /**
     * Returns the transformation value of the y intercept of the chicken 
     * @return y
     */
    public double getTransformation(){
        return y;
    }

    /**
     * Changes the chicken image to the dead chicken image
     */
    public void die(){
        deadChicken.setX(chicken.getX());
        deadChicken.setY(chicken.getY());
        getChildren().remove(chicken);
        getChildren().add(deadChicken);
    }
}