
/**
 * This class calculates tax.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
import java.util.Scanner;
public class P52
{
    public static void main(String []args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your status('married' or 'single'): ");
        String status = in.next();
        String married = "married";
        String single = "single";
        
        System.out.print("\nEnter your taxable income in dollars: ");
        double taxableIncome = in.nextDouble();
        
        String tax;
        
        if(status.equals(single) & taxableIncome > 0 & taxableIncome <= 8000){
            tax = "10%";
        }
        else if(status.equals(single) & taxableIncome > 8000 & taxableIncome <= 32000){
            tax = "$800 + 15%";
        }
        else if(status.equals(single) & taxableIncome > 32000){
            tax = "$4,400 + 25%";
        }
        else if(status.equals(married) & taxableIncome > 0 & taxableIncome <= 16000){
            tax = "10%";
        }
        else if(status.equals(married) & taxableIncome > 16000 & taxableIncome <= 64000){
            tax = "$1,600 + 15%";
        }
        else {
            tax = "$8,800 + 25%";
        }
        System.out.print("\nYour tax is " + tax + " of your income.");
    }
}
