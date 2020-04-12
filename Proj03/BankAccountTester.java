
/**
 * Write a description of class BankAccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccountTester
{
    public static void main(String[] args){
        System.out.println("Exercise 3.6:");
        BankAccount momsAcct = new BankAccount();
        System.out.println("After new = " + momsAcct.getBalance());
        System.out.println("Balance expected = 0");
        
        momsAcct.deposit(1000);
        System.out.println("After first deposit = " + momsAcct.getBalance());
        System.out.println("Balance exepected = 1000");
        
        momsAcct.withdraw(500);
        System.out.println("After first withdraw = " + momsAcct.getBalance());
        System.out.println("Balance exepected = 500");
        
        momsAcct.withdraw(100);
        System.out.println("After second withdraw = " + momsAcct.getBalance());
        System.out.println("Balance exepected = 400");
        
        System.out.println("\nExercise 3.7:");
        momsAcct.deposit(600);
        System.out.println("After second deposit =" + momsAcct.getBalance());
        System.out.println("Balance expected = 1000");
        
        momsAcct.addInterest(10);
        System.out.println("After interest =" + momsAcct.getBalance());
        System.out.println("Balance expected = 1100");
    }
}
