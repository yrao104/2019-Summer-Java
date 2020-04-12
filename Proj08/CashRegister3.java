/**
* A cash register totals up sales and computes change due.
* @author A. Nguyen 
* @version 1.0
*/
public class CashRegister3
{
   private double purchase;
   private double payment;
   private Coin[] coinArr = new Coin[5];
   private int counter;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister3()
   {
      purchase = 0;
      payment = 0;
      Coin dollar = new Coin(1.0, "Dollar");
      Coin quarter = new Coin(0.25, "Quarter");
      Coin dime = new Coin(0.10, "Dime");
      Coin nickel = new Coin(0.05, "Nickel");
      Coin penny = new Coin(0.01, "Penny");
      Coin[] coinArr = {dollar, quarter, dime, nickel, penny};
      counter = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
      counter++;
   }
   

   /**
      Record (part of) the payment, per coin type, and accumlate into total payment
      @param count number of coins received
      @param coinType the coin received
   */
   public void receivePayment(int count, Coin coinType) {
       double coinValue = coinType.getValue();
       payment += coinValue * count;
    }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double[] getReceiptInfo()
   {
      double change = payment - purchase;
       double[] receipt = {counter, purchase, payment, change};
      return receipt;
   }
    
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public int[] giveChange()
   {
      double change = payment - purchase;
      int dol = (int)change / 1;
      int q = (int)(change%1 / 0.25);
      int dim = (int)((change%1%0.25) / 0.10);
      int n = (int)(((change%1%0.25)%0.10) / 0.05);
      int p = (int)((((change%1%0.25)%0.10)%0.05) / 0.01);
      int[] change1 = {dol, q, dim, n, p};
      payment = 0;
      purchase = 0;
      counter = 0;
      return change1;
   }
}
