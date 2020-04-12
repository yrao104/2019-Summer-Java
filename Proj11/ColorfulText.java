
/**
 * This class creates a program that displays 5 texts vertically with different colors and opacities.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.util.Random;
import javafx.scene.layout.BorderPane;

public class ColorfulText extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane to hold the texts 
        BorderPane pane = new BorderPane(); 
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setCenter(getHBox());
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane); 
        primaryStage.setTitle("ShowText"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    } 
  
    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        
        Random randint = new Random();
        
        for(int i = 0; i < 5; i++){
            Text texti = new Text(20, 50, "Hello");
            texti.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
            texti.setRotate(90);
            double num1 = randint.nextDouble();
            double num2 = randint.nextDouble();
            double num3 = randint.nextDouble();
            double num4 = randint.nextDouble();
            Color colori = new Color(num1, num2, num3, num4);
            texti.setFill(colori);
            hBox.getChildren().add(texti);
        }
        
        return hBox;
    }
    
     public static void main(String[] args) { 
       Application.launch(args);
    }
}
