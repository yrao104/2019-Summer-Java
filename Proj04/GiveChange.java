
/**
 * This class directs a cashier on how to give change.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
import java.util.Scanner;

public class GiveChange
{
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter the amount due in pennies: ");
       int amountDue = in.nextInt();
       
       System.out.println("Enter the amount recieved from the user in pennies: ");
       int amountRecieved = in.nextInt();
       
       int change = amountRecieved - amountDue;
       int dollars = change/100;
       int quarters = (change % 100) / 25;
       int dimes = ((change % 100) % 25) / 10;
       int nickels = (((change % 100) % 25) % 10) / 5;
       int pennies = (((change % 100) % 25) % 10) % 5;
       
       System.out.println("Total change: " + change);
       System.out.println("Dollars: " + dollars);
       System.out.println("Quarters: " + quarters);
       System.out.println("Dimes: " + dimes);
       System.out.println("Nickels: " + nickels);
       System.out.println("Pennies: " + pennies);
    }
}
