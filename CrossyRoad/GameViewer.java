import javafx.application.Application; 
import javafx.animation.PathTransition;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.shape.Line;
import javafx.animation.FadeTransition; 
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import java.util.concurrent.TimeUnit;
import javafx.animation.KeyFrame;

/**
 * This class represents the user's screen.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

public class GameViewer extends Application { 
    //instance variables
    private DistanceScore ds = new DistanceScore();
    private Vehicle vehicle;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {  
        // Hold two buttons in an HBox 
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        
        BorderPane borderPane = new BorderPane();
        
        Scene scene = new Scene(borderPane, 500, 700);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        Terrain terraina = new Terrain();
        Chicken chicken = new Chicken(terraina);
        vehicle = new Vehicle(chicken, ds, borderPane, terraina, scene);
        terraina.getVehicleObject(vehicle);
        terraina.createTerrain(1);
        terraina.createTerrain(2);
        terraina.createTerrain(3);
        terraina.createTerrain(4);

        ImageView logo = new ImageView("images/logo.png"); 
        borderPane.setCenter(logo); 

        FadeTransition ft = new FadeTransition(Duration.millis(3000), logo); 
        ft.setFromValue(1.0); 
        ft.setToValue(0.0); 
        ft.setCycleCount(1); 
        ft.setAutoReverse(true); 
        ft.play(); // Start animation

        Timeline timeline = new Timeline(new KeyFrame(
                    Duration.millis(2500),
                    ae -> borderPane.setCenter(terraina)));
        timeline.play(); 

        Timeline timeline2 = new Timeline(new KeyFrame(
                    Duration.millis(2500),
                    ae -> borderPane.getChildren().add(chicken)));
        timeline2.play();

        Timeline timeline3 = new Timeline(new KeyFrame(
                    Duration.millis(2500),
                    ae -> borderPane.getChildren().add(ds)));
        timeline3.play();

        Timeline timeline4 = new Timeline(new KeyFrame(
                    Duration.millis(2500),
                    ae -> borderPane.getChildren().add(vehicle)));
        timeline4.play();
        // Create a scene and place it in the stage

        borderPane.setBottom(hBox); 
        BorderPane.setAlignment(hBox, Pos.CENTER); 

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                        if(event.getCode() == KeyCode.UP && chicken == null){
                            event.consume();
                        }
                        else if(event.getCode() == KeyCode.LEFT && chicken == null){    
                            event.consume();
                        }
                        else if(event.getCode() == KeyCode.RIGHT && chicken == null){
                            event.consume();
                        }
                        else if(event.getCode() == KeyCode.UP){
                            int y = chicken.up();
                            borderPane.setTranslateY(y);
                            terraina.createTerrain(3);
                            ds.updateScore();
                        }
                        else if(event.getCode() == KeyCode.LEFT){    
                            chicken.left();
                        }
                        else if(event.getCode() == KeyCode.RIGHT){
                            chicken.right();
                        }
                    }
                });

        chicken.requestFocus(); // Request focus on chicken 

        //check for intersection

    }
}
