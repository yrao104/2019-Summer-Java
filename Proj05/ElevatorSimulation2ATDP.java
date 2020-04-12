import java.util.Scanner;

/**
   This program simulates an elevator panel that skips the 13th floor, checking for 
   input errors.
*/
public class ElevatorSimulation2ATDP
{
   public static void main(String[] args)
   {  
      Scanner kBoard = new Scanner(System.in);
      System.out.print("Which floor do you want to go to? (1-20, except 13): ");
      if (kBoard.hasNextInt()) // i.e., user entered an integer 
      {
         int reqFloor = kBoard.nextInt();
         int actualFloor;
         if (reqFloor < 13) {
             actualFloor = reqFloor;
             
          }
          else {
              actualFloor = reqFloor - 1;
            
         }
         System.out.println(actualFloor + " is the actual floor.");
      }
      else// i.e., the user did not enter an integer
      {
           System.out.print("Please enter your floor number: ");
      }

   }
}
