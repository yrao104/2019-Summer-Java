import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Lia10, C.15

public class LoanCalculator extends Application {
    private TextField tfMonthlyInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField(); 
    private TextField tfinvestmentAmount = new TextField(); 
    private Label lbFutureValue = new Label();
    //private Label lbTotalPayment = new Label();
    private Button btCalculate = new Button("Calculate");
    
    @Override // Override the start method in the Application class 
    public void start(Stage primaryStage) { 
        // Create UI 
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5); 
        gridPane.setVgap(5); 
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0); 
        gridPane.add(tfMonthlyInterestRate, 1, 0); 
        gridPane.add(new Label("Number of Years:"), 0, 1); 
        gridPane.add(tfNumberOfYears, 1, 1); 
        gridPane.add(new Label("Investment Amount:"), 0, 2); 
        gridPane.add(tfinvestmentAmount, 1, 2); 
        gridPane.add(new Label("Future Value:"), 0, 3); 
        gridPane.add(lbFutureValue, 1, 3); 
        //gridPane.add(new Label("Total Payment:"), 0, 4); 
        //gridPane.add(lbTotalPayment, 1, 4); 
        gridPane.add(btCalculate, 1, 5); 
        
        // Set properties for UI 
        gridPane.setAlignment(Pos.CENTER); 
        tfMonthlyInterestRate.setAlignment(Pos.BOTTOM_RIGHT); 
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT); 
        tfinvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT); 
        lbFutureValue.setAlignment(Pos.BOTTOM_RIGHT); 
        //lbTotalPayment.setAlignment(Pos.BOTTOM_RIGHT); 
        GridPane.setHalignment(btCalculate, HPos.RIGHT); 
        
        // Process events 
        btCalculate.setOnAction(e -> calculateLoanPayment()); 
        
        // Create a scene and place it in the stage 
        Scene scene = new Scene(gridPane, 400, 250); 
        primaryStage.setTitle("LoanCalculator"); // Set title 
        primaryStage.setScene(scene); // Place the scene in the stage 
        primaryStage.show(); // Display the stage 
    } 
    
    private void calculateLoanPayment() { 
        // Get values from text fields 
        double interest = 
        Double.parseDouble(tfMonthlyInterestRate.getText()); 
        int year = Integer.parseInt(tfNumberOfYears.getText()); 
        double loanAmount = 
        Double.parseDouble(tfinvestmentAmount.getText()); 
        
        double futureValue = 
        Double.parseDouble(tfMonthlyInterestRate.getText()); 
        // Create a loan object. Loan defined in Listing 10.2 
        Loan loan = new Loan(interest, year, loanAmount); 
        
        // Display monthly payment and total payment 
        lbFutureValue.setText(String.format("$%.2f", 
        loan.getMonthlyPayment())); 
        //lbTotalPayment.setText(String.format("$%.2f", 
        //loan.getTotalPayment())); 
    } 
}

