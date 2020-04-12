import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Affine;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.PathTransition;
import javafx.scene.shape.Line;
import javafx.geometry.Bounds; 
import java.util.ArrayList;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.layout.BorderPane;
import javafx.application.Platform;

/**
 * This class represents the roads in the game.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Terrain extends Pane
{
    // instance variables
    private int y;
    private int dashx;
    private int dashy;
    private int[] widthRoadChoices = {100, 150};
    private int[] widthGrassChoices = {50, 100, 150};
    private int widthroad;
    private int widthgrass;
    private Rectangle grass;
    private Rectangle roadi;
    private Rectangle roadii;
    private Rectangle grassi;
    private Rectangle grassii;
    ImageView tree1 = new ImageView("images/tree1.png"); 
    ImageView tree2 = new ImageView("images/tree2.png"); 
    ImageView tree3 = new ImageView("images/tree3.png"); 
    ImageView tree4 = new ImageView("images/tree4.png"); 
    private int[] trees = {1, 2, 3, 4};
    private ImageView tree11;
    private ImageView tree22;
    private ImageView tree33;
    private ImageView tree44;
    private Random randint = new Random();
    private Vehicle vehicle;
    
    /**
     * Constructor for objects of class Terrain
     */
    public Terrain()
    {
        //initial grass stretch in beginning
        grass = new Rectangle(0 - 25, 500, 550, 245);
        grass.setRotate(10);
        grass.setFill(Color.GREENYELLOW);
        getChildren().add(grass);

        widthroad = widthRoadChoices[randint.nextInt(2)];
        widthgrass = widthGrassChoices[randint.nextInt(3)];

        y = 500 - widthroad;
        dashx = 10;
        dashy = 500 - widthroad + widthroad/2 - widthroad/2 + 5;
        
        //intial tree set
        tree2.setX(175);
        tree2.setY(425);
        getChildren().add(tree2);
        tree3.setX(150);
        tree3.setY(420);
        getChildren().add(tree3);
        tree4.setX(300);
        tree4.setY(425);
        getChildren().add(tree4);
        tree3.setTranslateX(425);
        tree3.setTranslateY(320);
    }
    
    /**
     * Gets the vehicle instance from GameViewer to create the cars
     * @param vehicle The vehicle object
     */
    public void getVehicleObject(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    
    /**
     * Creates a new road and grass stretch after the road
     * @param i An integer
     */
    public void createTerrain(int i)
    {
        Random randint = new Random();

        dashx = 10;

        //road
        roadi = new Rectangle(0 - 25, y, 550, widthroad);
        roadi.setRotate(10);
        roadi.setFill(Color.DARKSLATEGRAY);
        getChildren().add(roadi);

        //road dashes
        int b = 0;
        int d = 0;
        int e = 0;
        if(widthroad == 150 && b < 2 && widthgrass == 100){
            dashy = y + 10;
            for(int num = 0; num < 2; num++){
                for(int n = 0; n < 5; n++){
                    roadii = new Rectangle(dashx, dashy, 50, 5);
                    dashx += 120;
                    roadii.setRotate(10);
                    roadii.setFill(Color.DARKGRAY);
                    getChildren().add(roadii);
                    dashy += 20;
                }
                dashy -= 50;
                dashx = 10;
            }
            dashy = dashy - widthroad - widthgrass - widthgrass/2 - widthroad/2;
        }
        else if(widthroad == 150 && b < 2 && widthgrass == 50){
            dashy = y + 10;
            for(int num = 0; num < 2; num++){
                for(int n = 0; n < 5; n++){
                    roadii = new Rectangle(dashx, dashy, 50, 5);
                    dashx += 120;
                    roadii.setRotate(10);
                    roadii.setFill(Color.DARKGRAY);
                    getChildren().add(roadii);
                    dashy += 20;
                }
                dashy -= 50;
                dashx = 10;
            }
            dashy = dashy - widthroad - widthgrass - widthgrass/2 - widthroad/5;
        }
        else if(widthroad == 150 && b < 2 && widthgrass == 150){
            dashy = y + 10;
            for(int num = 0; num < 2; num++){
                for(int n = 0; n < 5; n++){
                    roadii = new Rectangle(dashx, dashy, 50, 5);
                    dashx += 120;
                    roadii.setRotate(10);
                    roadii.setFill(Color.DARKGRAY);
                    getChildren().add(roadii);
                    dashy += 20;
                }
                dashy -= 50;
                dashx = 10;
            }
            dashy = dashy - widthroad - widthgrass - widthgrass/2 - widthroad/5;
        }
        else{
            dashy = y + widthroad/2 - widthroad/3 - widthroad/8;
            for(int n = 0; n < 5; n++){
                roadii = new Rectangle(dashx, dashy, 50, 5);
                dashx += 120;
                roadii.setRotate(10);
                roadii.setFill(Color.DARKGRAY);
                roadii.setTranslateY(5);
                getChildren().add(roadii);
                dashy += 20;
            }
            //dashy = dashy - widthroad + 5 - widthgrass - widthroad + 5 - widthroad/10;
            //dashy = dashy - 100 - widthgrass;
        }

        //grass
        grassi = new Rectangle(0 - 25, y - widthgrass, 550, widthgrass);
        grassi.setRotate(10);
        grassi.setFill(Color.GREENYELLOW);
        getChildren().add(grassi);

        //3d aspect of grass
        grassii = new Rectangle(0 - 25, y - 5, 550, 6);
        grassii.setRotate(10);
        grassii.setFill(Color.LIMEGREEN);
        getChildren().add(grassii);
        
        if(widthroad == 100){
            vehicle.createVehicle(widthroad, y + widthroad/4, y + widthroad/2 + widthroad/4, y + widthroad/2 + widthroad/3);
        }
        else{
            vehicle.createVehicle(widthroad, y + widthroad/6, y + widthroad/2, y + widthroad/2 + widthroad/3);
        }
        createGrassSet(widthgrass, widthroad, y);

        widthroad = widthRoadChoices[randint.nextInt(2)];

        dashx = 10;
        y = y - widthgrass - widthroad;
        widthgrass = widthGrassChoices[randint.nextInt(3)];
    }

    /**
     * Creates as a set of trees based on the width of the grass stretch
     * @param widthgrass The integer width of the grass in the terrain class
     * @param widthroad The integer width of the road in the terrain class
     * @param yvalue The integer y value of the rectangle for the grass stretch
     */
    public void createGrassSet(int widthgrass, int widthroad, int yvalue) {
        if(widthgrass == 50){
            for(int i = 0; i < randint.nextInt(6); i++){
                int tree = trees[randint.nextInt(4)];
                if(tree == 1){
                    tree11 = new ImageView("images/tree1.png");
                    tree11.setX(randint.nextInt(499) + 1);
                    if(tree11.getX() < 250){
                        tree11.setY(yvalue + widthroad - 20);
                    }
                    else{
                        tree11.setY(yvalue + widthroad - 10);
                    }
                    getChildren().add(tree11);
                }
                else if(tree == 2){
                    tree22 = new ImageView("images/tree2.png");
                    tree22.setX(randint.nextInt(499) + 1);
                    if(tree22.getX() < 250){
                        tree22.setY(yvalue + widthroad - 30);
                    }
                    else{
                        tree22.setY(yvalue + widthroad - 30);
                    }
                    getChildren().add(tree22);
                }
                else if(tree == 3){
                    tree33 = new ImageView("images/tree3.png");
                    tree33.setX(randint.nextInt(499) + 1);
                    if(tree33.getX() < 250){
                        tree33.setY(yvalue + widthroad - 40);
                    }
                    else{
                        tree33.setY(yvalue + widthroad - 10);
                    }
                    getChildren().add(tree33);
                }
                else{
                    tree44 = new ImageView("images/tree4.png");
                    tree44.setX(randint.nextInt(499) + 1);
                    if(tree44.getX() < 250){
                        tree44.setY(yvalue + widthroad - 50);
                    }
                    else{
                        tree44.setY(yvalue + widthroad - 50);
                    }
                    getChildren().add(tree44);
                }
            }
        }
        else if(widthgrass == 100){
            for(int i = 0; i < randint.nextInt(12); i++){
                int tree = trees[randint.nextInt(4)];
                if(tree == 1){
                    tree11 = new ImageView("images/tree1.png");
                    tree11.setX(randint.nextInt(499) + 1);
                    if(tree11.getX() < 250){
                        tree11.setY(yvalue + widthroad - 40 + randint.nextInt(50));
                    }
                    else{
                        tree11.setY(yvalue + widthroad + 15 + randint.nextInt(50));
                    }
                    getChildren().add(tree11);
                }
                else if(tree == 2){
                    tree22 = new ImageView("images/tree2.png");
                    tree22.setX(randint.nextInt(499) + 1);
                    if(tree22.getX() < 250){
                        tree22.setY(yvalue + widthroad - 50 + randint.nextInt(50));
                    }
                    else{
                        tree22.setY(yvalue + widthroad - 5 + randint.nextInt(50));
                    }
                    getChildren().add(tree22);
                }
                else if(tree == 3){
                    tree33 = new ImageView("images/tree3.png");
                    tree33.setX(randint.nextInt(499) + 1);
                    if(tree33.getX() < 250){
                        tree33.setY(yvalue + widthroad - 60 + randint.nextInt(50));
                    }
                    else{
                        tree33.setY(yvalue + widthroad - 10 + randint.nextInt(50));
                    }
                    getChildren().add(tree33);
                }
                else{
                    tree44 = new ImageView("images/tree4.png");
                    tree44.setX(randint.nextInt(499) + 1);
                    if(tree44.getX() < 250){
                        tree44.setY(yvalue + widthroad - 90 + randint.nextInt(30));
                    }
                    else{
                        tree44.setY(yvalue + widthroad - 20 + randint.nextInt(50));
                    }
                    getChildren().add(tree44);
                }
            }
        }
        else if(widthgrass == 150){
            for(int i = 0; i < randint.nextInt(12); i++){
                int tree = trees[randint.nextInt(4)];
                if(tree == 1){
                    tree11 = new ImageView("images/tree1.png");
                    tree11.setX(randint.nextInt(499) + 1);
                    if(tree11.getX() < 250){
                        tree11.setY(yvalue + widthroad - 50 + randint.nextInt(100));
                    }
                    else{
                        tree11.setY(yvalue + widthroad - 10 + randint.nextInt(100));
                    }
                    getChildren().add(tree11);
                }
                else if(tree == 2){
                    tree22 = new ImageView("images/tree2.png");
                    tree22.setX(randint.nextInt(499) + 1);
                    if(tree22.getX() < 250){
                        tree22.setY(yvalue + widthroad - 60 + randint.nextInt(100));
                    }
                    else{
                        tree22.setY(yvalue + widthroad - 10 + randint.nextInt(100));
                    }
                    getChildren().add(tree22);
                }
                else if(tree == 3){
                    tree33 = new ImageView("images/tree3.png");
                    tree33.setX(randint.nextInt(499) + 1);
                    if(tree33.getX() < 250){
                        tree33.setY(yvalue + widthroad - 50 + randint.nextInt(50));
                    }
                    else{
                        tree33.setY(yvalue + widthroad - 30 + randint.nextInt(50));
                    }
                    getChildren().add(tree33);
                }
                else{
                    tree44 = new ImageView("images/tree4.png");
                    tree44.setX(randint.nextInt(499) + 1);
                    if(tree44.getX() < 250){
                        tree44.setY(yvalue + widthroad - 60 + randint.nextInt(80));
                    }
                    else{
                        tree44.setY(yvalue + widthroad - 30 + randint.nextInt(100));
                    }
                    getChildren().add(tree44);
                }
            }
        }
    } 
}