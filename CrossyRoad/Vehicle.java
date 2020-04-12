import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Translate;
import java.util.Random;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.PathTransition;
import javafx.scene.shape.Line; 
import java.util.Timer;
import java.util.ArrayList;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.application.Platform;
import java.util.TimerTask;
import javafx.scene.layout.BorderPane;
import javafx.animation.KeyFrame;
import javafx.scene.Scene;

/**
 * This class represents the vehicles in the game.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

class Vehicle extends Pane {
    //instance variables
    private String[] vehicles = {"blue", "green", "purple", "yellow", "orange", "redtruck"};
    private ArrayList<ImageView> cars = new ArrayList<ImageView>();
    private ArrayList<PathTransition> list = new ArrayList<PathTransition>();
    private Random randint = new Random();
    private Chicken chicken;
    private DistanceScore ds;
    private Text end;
    private Text scoreTitle;
    private Text scoreNum;

    //constructors
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(Chicken chicken, DistanceScore ds, BorderPane borderPane, Terrain terraina, Scene scene) { 
        this.chicken = chicken;
        this.ds = ds;
        Timer timer = new Timer();
        timer.schedule(new Collision(chicken, end, scoreNum, scoreTitle, borderPane, terraina, scene), 0, 500);
    }

    /**
     *Creates a random vehicle at a random location on the road that moves off the screen.
     *@param widthroad The integer value of the width of the road being created
     *@param yvalue1 The yvalue that the image is going to show up at
     *@param yvalue2 the second y value where the image is going to show up at
     *@param yalue3 the third y value where the image is going to show up at
     */
    public void createVehicle(int widthroad, int yvalue1, int yvalue2, int yvalue3) {
        String carColor = vehicles[randint.nextInt(6)];
        Line line1 = new Line(-100, yvalue1, 600, yvalue1);
        line1.setRotate(10);
        Line line2 = new Line(600, yvalue2, -100, yvalue2);
        line2.setRotate(10);
        Line line3 = new Line(-100, yvalue3, 600, yvalue3);
        line3.setRotate(10);

        if(carColor.equals("blue")){
            ImageView blueCarLeft = new ImageView("images/bluecarleft.png"); 
            ImageView blueCarRight = new ImageView("images/bluecarright.png"); 
            ImageView blueCarRight1 = new ImageView("images/bluecarright.png"); 
            createCars(blueCarLeft, blueCarRight, blueCarRight1, line1, line2, line3, widthroad);
        }
        else if(carColor.equals("orange")){
            ImageView orangeCarRight = new ImageView("images/orangecarright.png");
            ImageView orangeCarLeft = new ImageView("images/orangecarleft.png"); 
            ImageView orangeCarRight1 = new ImageView("images/orangecarright.png");
            createCars(orangeCarLeft, orangeCarRight, orangeCarRight1, line1, line2, line3, widthroad);
        }
        else if(carColor.equals("green")){
            ImageView greenCarLeft = new ImageView("images/greencarleft.png");  
            ImageView greenCarRight = new ImageView("images/greencarright.png"); 
            ImageView greenCarRight1 = new ImageView("images/greencarright.png");
            createCars(greenCarLeft, greenCarRight, greenCarRight1, line1, line2, line3, widthroad);
        }
        else if(carColor.equals("purple")){
            ImageView purpleCarLeft = new ImageView("images/purplecarleft.png"); 
            ImageView purpleCarRight = new ImageView("images/purplecarright.png");
            ImageView purpleCarRight1 = new ImageView("images/purplecarright.png");
            createCars(purpleCarLeft, purpleCarRight, purpleCarRight1, line1, line2, line3, widthroad);
        }
        else if(carColor.equals("yellow")){
            ImageView yellowCarLeft = new ImageView("images/yellowcarleft.png");  
            ImageView yellowCarRight = new ImageView("images/yellowcarright.png");; 
            ImageView yellowCarRight1 = new ImageView("images/yellowcarright.png");
            createCars(yellowCarLeft, yellowCarRight, yellowCarRight1, line1, line2, line3, widthroad);
        }
        else{
            ImageView redTruckLeft = new ImageView("images/redtruckleft.png");
            ImageView redTruckRight = new ImageView("images/redtruckright.png");
            ImageView redTruckRight1 = new ImageView("images/redtruckright.png");
            createCars(redTruckLeft, redTruckRight, redTruckRight1, line1, line2, line3, widthroad);
        }
    }

    private void createCars(ImageView carleft, ImageView carright, ImageView carright1, 
    Line line1, Line line2, Line line3, int widthroad){
        getChildren().add(carright);
        getChildren().add(carleft);

        cars.add(carleft);
        cars.add(carright);
        if(widthroad == 100){
            PathTransition pt = new PathTransition(Duration.millis(3000),line1, carright); 
            pt.setCycleCount(Timeline.INDEFINITE); 
            list.add(pt);
            pt.play(); // Start animation

            PathTransition pt2 = new PathTransition(Duration.millis(3000),line2, carleft); 
            pt2.setCycleCount(Timeline.INDEFINITE); 
            list.add(pt2);
            pt2.play(); // Start animation
        }
        else{
            getChildren().add(carright1);
            PathTransition pt = new PathTransition(Duration.millis(3000),line1, carright); 
            pt.setCycleCount(Timeline.INDEFINITE); 
            list.add(pt);
            pt.play(); // Start animation

            PathTransition pt2 = new PathTransition(Duration.millis(3000),line2, carleft); 
            pt2.setCycleCount(Timeline.INDEFINITE); 
            list.add(pt2);
            pt2.play(); // Start animation

            PathTransition pt3 = new PathTransition(Duration.millis(3000),line3, carright1); 
            pt3.setCycleCount(Timeline.INDEFINITE); 
            list.add(pt3);
            pt3.play(); // Start animation

            cars.add(carright1);
        }
    }

    /**
     * This class checks if a collision occurs
     */
    class Collision extends TimerTask {
        //instance variables
        private Chicken chickenobj;
        private Text end;
        private Text scoreNum;
        private Text scoreTitle;
        private BorderPane borderPane;
        private Terrain terrain;
        private Scene scene;

        /**
         * Constructor for Collision class
         */
        public Collision(Chicken chicken, Text end, Text scoreNum, Text scoreTitle, BorderPane borderPane, Terrain terrain, Scene scene){
            this.chickenobj = chicken;
            this.end = end;
            this.scoreNum = scoreNum;
            this.scoreTitle = scoreTitle;
            this.borderPane = borderPane;
            this.terrain = terrain;
            this.scene = scene;
        }

        /**
         * Creates a game over message in the center of the screen with the final distance score
         */
        public void gameOver(){
            //System.out.println("WORKS");
            double t = chickenobj.getTransformation();
            chickenobj.die();
            scene.setOnKeyPressed(null);
            chickenobj = null;
            Text end = new Text(100, 275, "GAME OVER");
            end.setFont(Font.font ("Toledo", 50));  //verdana
            end.setFill(Color.WHITE);
            end.setStroke(Color.WHITE);
            end.setStrokeWidth(3);
            Rectangle score = new Rectangle(0, 335, 600, 50);
            score.setFill(Color.DODGERBLUE);
            Text scoreTitle = new Text(180, 365, "SCORE : ");
            scoreTitle.setFont(Font.font ("Toledo", 25));  //verdana
            scoreTitle.setFill(Color.WHITE);
            scoreTitle.setStroke(Color.WHITE);
            scoreTitle.setStrokeWidth(1);
            Text scoreNum = new Text(275, 365, "" + ds.getDistanceScore());
            scoreNum.setFont(Font.font ("Toledo", 25));  //verdana
            scoreNum.setFill(Color.WHITE);
            scoreNum.setStroke(Color.WHITE);
            scoreNum.setStrokeWidth(1);
            borderPane.getChildren().addAll(score, end, scoreNum, scoreTitle);
            score.setY(score.getY() - t);
            end.setY(end.getY() - t);
            scoreNum.setY(scoreNum.getY() - t);
            scoreTitle.setY(scoreTitle.getY() - t);
            //System.out.println(t);
        }

        /**
         * Overrides the run method of the TimerTask class and checks for a collision through the node class
         */
        public void run() {
            for(int i = 0; i < cars.size(); i++){
                if(chickenobj != null){
                    double x1 = list.get(i).getNode().getTranslateX();
                    double y1 = list.get(i).getNode().getTranslateY();

                    double x2 = chickenobj.getX();
                    double y2 = chickenobj.getY();

                    //System.out.println("Car: " + x1 + ", " + y1);
                    //System.out.println("Chicken: " + x2 + ", " + y2);

                    Platform.runLater(() -> {
                            if(Math.abs(x1 - x2) <= 25 && Math.abs(y1 - y2) <= 25){
                                gameOver();
                            }
                            else{
                                //System.out.println(":(");
                            }
                    });
                }
            }   
        }
    }
}