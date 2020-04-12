import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandleEvent extends Application {   
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) { 
        // Create buttons and register with handlers
        Button btOK = new Button("OK");
        btOK.setOnAction(new OKHandlerClass()); 

        Button btCancel = new Button("Cancel");
        btCancel.setOnAction(new CancelHandlerClass());

        // Create a pane, add buttons to it, and set its properties
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(btOK, btCancel);
        
        // Create a scene and place it in the stage 
        Scene scene = new Scene(pane); 
        primaryStage.setTitle("HandleEvent"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    } 
} 

// Handler for "OK" button
class OKHandlerClass implements EventHandler<ActionEvent> { 
    @Override
    public void handle(ActionEvent e) { 
        System.out.println("HandleEvent: OK button clicked");
    } 
}

// Handler for "Cancel" button
class CancelHandlerClass implements EventHandler<ActionEvent> { 
    @Override
    public void handle(ActionEvent e) { 
        System.out.println("HandleEvent: Cancel button clicked");
    } 
}
