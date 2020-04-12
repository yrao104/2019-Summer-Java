import javafx.application.Application; 
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MoveTheBall extends Application { 
    private CirclePane circlePane = new CirclePane();
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) { 
        // Hold two buttons in an HBox 
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btLeft = new Button("Left");
        Button btRight = new Button("Right"); 
        Button btUp = new Button("Up"); 
        Button btDown = new Button("Down"); 
        hBox.getChildren().add(btLeft);
        hBox.getChildren().add(btRight);
        hBox.getChildren().add(btUp);
        hBox.getChildren().add(btDown);
        
        // Create and register the handler
        btLeft.setOnAction(e -> circlePane.left());
        btRight.setOnAction(e -> circlePane.right());
        btUp.setOnAction(e -> circlePane.up());
        btDown.setOnAction(e -> circlePane.down());
        
        circlePane.setOnKeyPressed(e -> { 
            if (e.getCode() == KeyCode.UP) { 
                circlePane.up();
            }
            else if (e.getCode() == KeyCode.DOWN) { 
                circlePane.down();
            } 
            else if (e.getCode() == KeyCode.LEFT) { 
                circlePane.left();
            } 
            else if (e.getCode() == KeyCode.RIGHT) { 
                circlePane.right();
            } 
        });
        
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox); 
        BorderPane.setAlignment(hBox, Pos.CENTER); 
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setTitle("ControlCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        circlePane.requestFocus(); // Request focus on circlePane
    } 
}
