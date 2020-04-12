/**
* A cash register totals up sales and computes change due.
* @author A. Nguyen 
* @version 1.0
*/
public class CashRegisterATDP2
{
   private double purchase;
   private double payment;
   private int numOfPurchases;
   private double[] receipt;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegisterATDP2()
   {
      purchase = 0;
      payment = 0;
      numOfPurchases = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase += amount;
      numOfPurchases ++;
   }
   

   /**
      Record (part of) the payment, per coin type, and accumlate into total payment
      @param count number of coins received
      @param coinType the coin received
   */
   public void receivePayment(int count, CoinATDP coinType) {
       double value = coinType.getValue();
       payment = count * value + payment;
    }
   
   /**
    * Returns an array of 4 values displaying the receipt value.
    */
   public double[] getReceiptVals(){
        receipt = new double[4];
        receipt[0] = numOfPurchases;
        receipt[1] = purchase;
        receipt[2] = payment;
        receipt[3] = payment - purchase;
        
        return receipt;
   }
    
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      payment = 0;
      purchase = 0;
      numOfPurchases = 0;
      return change;
   }
}