public class SwapTester
{
   /**
      Swaps two values
      @param array an array of length 2 containing the
      values to be swapped
   */
   public static void trueSwap(int[] array)
   {
      // TODO: Complete
      int a = array[0];
      int b = array[1];
      int c = a;
      array[0] = b;
      array[1] = c;
      System.out.println(b + " " + c);
   }

   public static void main(String[] args)
   {
      int[] xy = new int[2];
      xy[0] = 3;
      xy[1] = 4;
      // TODO: call trueSwap and print swapped values
      trueSwap(xy);
      System.out.println("Expected: 4 3");
   }
}