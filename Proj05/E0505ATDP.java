import java.util.Random;

/**
   This program simulates an elevator panel that skips the 13th floor, checking for 
   input errors.
*/
public class E0505ATDP
{
   /**
    * Given a number n, randomly generate an integer in the range
    * from -n to n.
    * @param maxAbs the maximum absolute value of the resulting value
    * @return an integer in the range from -maxAbs to maxAbs
    */
   public static int getRandomInt(int maxAbs) {
       int n = (int) Math.round((Math.random() * (maxAbs)));
       if (Math.random() < .5) {
           n = -n;
        }
        return n;
   }
    
   public static void main(String[] args)
   {
       // Generate 3 random integers
       int i = getRandomInt(20);
       int j = getRandomInt(20);
       int k = getRandomInt(20);
       
       System.out.printf("The three numbers are %d, %d, %d\n", i, j, k);
       
       //Add your code here, for the rest of problem E5.5
       if(i > j && j > k){
           System.out.println("The numbers are decreasing.");
        }
       else if(k > j && j > i){
           System.out.println("The numbers are increasing.");
        }
       else{
            System.out.println("The numbers are neither decreasing nor increasing.");
        }
     
   }
}
