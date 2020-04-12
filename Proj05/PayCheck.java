
/**
 * This class calculates a pay check.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class PayCheck
{
    //Fields
    private String employeeName;
    private double hourlyWage;
    private double hoursWorked;
    
    //Constructors
    public PayCheck(double hourlyWage, String name){
        employeeName = name;
        this.hourlyWage= hourlyWage;
        hoursWorked = 0;
    }
    
    //Methods
    public void addHours(double hoursAdded){
        hoursWorked += hoursAdded;
    }
    
    public void raisePay(double dollarIncrease){
        hourlyWage += dollarIncrease;
    }
    
    public double calcWeekPay(){
       double payAmount;
       if(hoursWorked > 40){
           payAmount = 40 * hourlyWage + (hoursWorked - 40) * 1.5 * hourlyWage;
        }
        else{
            payAmount = hourlyWage * hoursWorked;
        }
        hoursWorked = 0;
        return payAmount;
    }
    public String toString(){
        return employeeName + " worked for " + hoursWorked  + " hours at $" + hourlyWage + " per hour.";
    }
}
