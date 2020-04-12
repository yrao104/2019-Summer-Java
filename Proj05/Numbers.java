
public class Numbers
{
   /**
      Computes a sum of even integers 
      @param a the lower bound (may be odd or even)
      @param b the upper bound (may be odd or even)
      @return the sum of even integers between a and b (inclusive).
   */
   public int evenSum(int a, int b)
   {
      // your work here
      int sum = 0;
      for(a = a; a <= b; a+=2){
         if(a%2 == 0) {
            sum+= a;
         }
         else{
            a = a + 1;
            sum+= a;
         }
      }
      return sum;
   }
}