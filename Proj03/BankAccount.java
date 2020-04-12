
/**
 * This class represents a bank account.
 *
 * @author Yamuna Rao
 * @version 1.0
 */
public class BankAccount
{
    // Fields
    private double balance;
    
    // Constructors
    /**
     * Initialize balance to zero.
     */
    public BankAccount() {
        balance = 0;
    }
    
    /**
     * Initialize balance to given balance.
     * @param initBal Initial balance
     */
    public BankAccount(double initBal) {
        balance = initBal;
    }
    
    // Methods
    /**
     * Add to balance.
     * @param amt Amount to deposit
     */
    public void deposit(double amt){
        balance = balance + amt;
    }
    
    /**
     * Subtract from balance.
     * @param amt Amount to withdraw
     */
    public void withdraw(double amt){
        balance = balance - amt;
    }
    
    /**
     * Return the current balance
     * @return Current Balance
     */
    public double getBalance(){
        return balance;
    }
    
    /**
     * Add interest at the given rate
     * @param rate Interest rate added to the balance
     */
    public void addInterest(double rate){
        balance = balance * (1 + rate);
    }
}
