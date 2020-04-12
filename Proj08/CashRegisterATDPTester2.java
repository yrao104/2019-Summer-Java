/**
   This class tests the CashRegisterATDP class.
*/
public class CashRegisterATDPTester2
{
   public static void main(String[] args)
   {
       final double DOLLAR_VALUE = 1.0;
       final double QUARTER_VALUE = 0.25;
       final double DIME_VALUE = 0.1;
       final double NICKEL_VALUE = 0.05;
       final double PENNY_VALUE = 0.01;
       
      // FIRST PURCHASE
      // Create CashRegisterATDP object, and 
      // record price for each purchased item
      
      System.out.println("\nFIRST PURCHASE");
      
      CashRegisterATDP2 register = new CashRegisterATDP2(); 
      register.recordPurchase(0.75);
      register.recordPurchase(1.50);
      
      // Create Coin objects, and
      // Record price for each type of coin
      CoinATDP dollar = new CoinATDP(DOLLAR_VALUE, "Dollar");
      CoinATDP quarter = new CoinATDP(QUARTER_VALUE, "Quarter");
      CoinATDP dime = new CoinATDP(DIME_VALUE, "Dime");
      CoinATDP nickel = new CoinATDP(NICKEL_VALUE, "Nickel");
      CoinATDP penny = new CoinATDP(PENNY_VALUE, "Penny");
      register.receivePayment(2, dollar);
      register.receivePayment(2, quarter);
      register.receivePayment(2, nickel);
      register.receivePayment(2, dime);
      register.receivePayment(2, penny);
      
      double[] receiptVals = new double[4];
      receiptVals = register.getReceiptVals();
      System.out.println ("Number of items: " + receiptVals[0] );
      System.out.println ("Total: " + receiptVals[1] );
      System.out.printf ("Payment: %3.2f", receiptVals[2] );
      System.out.printf ("\nChange: %3.2f", receiptVals[3] );
      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.printf("%3.2f", register.giveChange());
      System.out.println("\n\tExpected change amount: .57");
      
      
      

      
      // SECOND PURCHASE
      // NOTE: Do NOT creat CashRegisterATDP object again
      // Record price for each purchased item
      
      System.out.println("\nSECOND PURCHASE");
            
      register.recordPurchase(2.25);
      register.recordPurchase(19.25);
      
      // NOTE: Do NOT creat Coin objects again
      // Record price for each type of coin
      register.receivePayment(23, dollar);
      register.receivePayment(16, quarter);
      register.receivePayment(5, dime);
      register.receivePayment(2, nickel);
      register.receivePayment(10, penny);
      
      double[] receiptVals2 = new double[4];
      receiptVals2 = register.getReceiptVals();
      System.out.println ("Number of items: " + receiptVals2[0] );
      System.out.println ("Total: " + receiptVals2[1] );
      System.out.printf ("Payment: %3.2f", receiptVals2[2] );
      System.out.printf ("\nChange: %3.2f", receiptVals2[3] );
      
      // Calculate & display change amount, in pennies
      System.out.print("\tChange: ");
      System.out.printf("%3.2f", register.giveChange());
      System.out.println("\n\tExpected change amount: $6.20"); 
   }
}