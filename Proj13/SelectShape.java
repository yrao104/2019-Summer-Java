import javafx.geometry.Insets; 
import javafx.stage.Stage; 
import javafx.scene.Scene;
import javafx.application.Application; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.geometry.Pos; 

public class SelectShape extends Application{ 
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) { 
        BorderPane pane = new BorderPane();
        HBox paneForRadioButtons = new HBox(100);
        //paneForRadioButtons.setAlignment(Pos.RIGHT);
        paneForRadioButtons.setPadding(new Insets(400, 5, 5, 5));
        paneForRadioButtons.setStyle("-fx-border-color: black");
        paneForRadioButtons.setStyle 
        ("-fx-border-width: 2px; -fx-border-color: black"); 
        RadioButton circle = new RadioButton("Circle"); 
        RadioButton rectangle = new RadioButton("Rectangle"); 
        RadioButton ellipse = new RadioButton("Ellipse"); 
        CheckBox chkFill = new CheckBox("Fill"); 
        paneForRadioButtons.getChildren().addAll(circle, rectangle, ellipse, chkFill); 
        pane.setLeft(paneForRadioButtons); 
        ToggleGroup group = new ToggleGroup(); 
        circle.setToggleGroup(group); 
        rectangle.setToggleGroup(group); 
        ellipse.setToggleGroup(group); 

        Circle circle1 = new Circle(50); 
        Rectangle rect1 = new Rectangle(200, 160, 140, 100);
        Ellipse ellipse1 = new Ellipse(250, 200, 70, 50);
        
        circle1.setFill(Color.WHITE);
        rect1.setFill(Color.WHITE);
        ellipse1.setFill(Color.WHITE);
        
        EventHandler<ActionEvent> handler = e -> { 
                if (chkFill.isSelected()) { 
                    circle1.setFill(Color.BLACK);
                    rect1.setFill(Color.BLACK);
                    ellipse1.setFill(Color.BLACK);
                }
                else{
                    circle1.setFill(Color.WHITE);
                    rect1.setFill(Color.WHITE);
                    ellipse1.setFill(Color.WHITE);
                }

            }; 

        circle.setOnAction(e -> { 
                if (circle.isSelected()) { 
                    pane.getChildren().removeAll(rect1, ellipse1, circle1);
                    circle1.setCenterX(250);
                    circle1.setCenterY(200);
                    pane.getChildren().add(circle1);
                } 
            });

        rectangle.setOnAction(e -> { 
                if (rectangle.isSelected()) {
                    pane.getChildren().removeAll(circle1, ellipse1, rect1);
                    pane.getChildren().add(rect1);
                } 
            }); 

        ellipse.setOnAction(e -> { 
                if (ellipse.isSelected()) {
                    pane.getChildren().removeAll(rect1, circle1, ellipse1);
                    pane.getChildren().add(ellipse1);
                } 
            }); 


        chkFill.setOnAction(handler);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 100, 100); 
        primaryStage.setTitle("LabelWithGraphic"); // Set the stage title 
        primaryStage.setScene(scene); // Place the scene in the stage 
        primaryStage.show(); // Display the stage 

        //return pane; 
    } 
}