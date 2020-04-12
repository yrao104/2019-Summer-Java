import java.util.Scanner;

/**
   This program simulates an elevator panel that skips the 13th floor, checking for 
   input errors.
*/
public class ElevatorSimulationLoop
{
   public static void main(String[] args)
   {  
      Scanner kBoard = new Scanner(System.in);
      System.out.print("Which floor do you want to go to? (1-20, except 13, or 'Q'): ");
      while (kBoard.hasNextInt()) // i.e., user entered an integer 
      {
         int reqFloor = kBoard.nextInt();
         int actualFloor = 0;
         if (reqFloor < 13 && reqFloor > 0) {
             actualFloor = reqFloor;
             System.out.println("The elevator will travel to the actual floor " + actualFloor);
             System.out.println("\nWhich floor do you want to go to? (1-20, except 13, or 'Q'): ");
          }
          else if(reqFloor > 13 && reqFloor <= 20){
              actualFloor = reqFloor - 1;
              System.out.println("The elevator will travel to the actual floor " + actualFloor);
              System.out.println("\nWhich floor do you want to go to? (1-20, except 13, or 'Q'): ");
         }
         else if(reqFloor == 13){
             System.out.println("NOTE: There is no thirteenth floor.");
             System.out.println("\nWhich floor do you want to go to? (1-20, except 13, or 'Q'): ");
         }
         
         else{
             System.out.println("NOTE: The floor must be between 1 and 20.");
             System.out.println("\nWhich floor do you want to go to? (1-20, except 13, or 'Q'): ");
         }
      }
      
      while (kBoard.hasNext()) // i.e., user entered a String
      {
         String a = kBoard.next();
         if(a.equals("q") || a.equals("Q")){
             System.out.println("Bye");
         }
         break;
      }
      
      kBoard.close();
    }
}
