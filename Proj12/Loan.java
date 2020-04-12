public class Loan {
    private double annualInterestRate; 
    private int numberOfYears; 
    private double investmentAmount; 
    private java.util.Date loanDate; 
    
    /** Default constructor */ 
    public Loan() { 
        this(2.5, 1, 1000); 
    } 
    
    /** Construct a loan with specified annual interest rate,
     * number of years, and loan amount
     */
    public Loan(double annualInterestRate, int numberOfYears, 
    double loanAmount) { 
        this.annualInterestRate = annualInterestRate; 
        this.numberOfYears = numberOfYears; 
        this.investmentAmount = loanAmount; 
        loanDate = new java.util.Date(); 
    } 
    
    /** Return annualInterestRate */ 
    public double getAnnualInterestRate() { 
        return annualInterestRate; 
    } 
    
    /** Set a new annualInterestRate */ 
    public void setAnnualInterestRate(double annualInterestRate) { 
        this.annualInterestRate = annualInterestRate; 
    } 
    
    /** Return numberOfYears */ 
    public int getNumberOfYears() { 
        return numberOfYears; 
    } 
    
    /** Set a new numberOfYears */ 
    public void setNumberOfYears(int numberOfYears) { 
        this.numberOfYears = numberOfYears; 
    } 
    
    /** Return loanAmount */ 
    public double getLoanAmount() { 
        return investmentAmount; 
    } 
    
    /** Set a new loanAmount */ 
    public void setLoanAmount(double loanAmount) { 
        this.investmentAmount = loanAmount; 
    } 
    
    /** Find monthly payment */ 
    public double getMonthlyPayment() { 
        double monthlyInterestRate = annualInterestRate / 1200; 
        double monthlyPayment = investmentAmount * monthlyInterestRate / (1 -
        (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); 
        double x = (1 + monthlyInterestRate);
        double y = (numberOfYears * 12);
        double z = Math.pow(x,y);
        double futureValue = investmentAmount * z;
        return futureValue;
    } 
    
    
    /** Find total payment */ 
    public double getTotalPayment() { 
        double totalPayment = getMonthlyPayment() * numberOfYears * 12; 
        return totalPayment; 
    } 
    
    /** Return loan date */ 
    public java.util.Date getLoanDate() { 
        return loanDate; 
    } 
}
