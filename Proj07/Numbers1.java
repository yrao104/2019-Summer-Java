public class Numbers1
{
   /**
      Computes the number of even and odd values in a given array
      @param values an array of integer values
      @return an array of length 2 whose 0 entry contains the count
      of even elements and whose 1 entry contains the count of odd
      values
   */
   public int[] evenOdds(int[] values)
   {
      int num = 0;
      int countEven = 0;
      int countOdd = 0;
      for(int i = 0; i < values.length; i++){
         num = values[i];
         if(num % 2 == 0){
            countEven++;
         }
         else{
            countOdd++;
         }
      }
      
      int[] oddEven = {countEven, countOdd};
      return oddEven;

   }
}