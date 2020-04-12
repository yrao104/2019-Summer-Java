
/**
 * Write a description of class MinValue here.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
import java.util.Scanner;
public class MinValue
{
    public static void main(String[] args){
        Scanner kBoard = new Scanner(System.in);
        int count = 0;
        int minVal = 0;
        int maxVal = 0;
        System.out.println("Enter an integer test score: ");
      while (kBoard.hasNextInt()) // i.e., user entered an integer 
      {
         int curVal = kBoard.nextInt();
         for(; ;count++){
            if(count == 0){ 
                minVal = curVal;
                maxVal = curVal;
            }
            else if(curVal < minVal){
                minVal = curVal;
            }
            else if(curVal > maxVal){
                maxVal = curVal;
            }
            else{
                break;
            }
        }
      }
       
      while(kBoard.hasNext()){
          String a = kBoard.next();
          if(a.equals("q") || a.equals("Q")){
             System.out.println("The min value is: " + minVal);
             System.out.println("The max value is: " + maxVal);
         }
         break;
       }
      kBoard.close();
    }
}
