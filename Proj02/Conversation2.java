/**
 * Have a brief conversation with the user.
 * 
 * @author Anh Nguyen 
 * @version Summer 2016
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("What country are you from? "); // Ask user
    String country = kboard.nextLine();         // Accept answer from user
    
    System.out.println(country + " is a great country!");
  
    
    System.out.print("\nHow many siblings do you have? "); // Ask user
    int siblings = kboard.nextInt();              // Accept answer from user

  
    System.out.println("Nice to know you have " + siblings + " sibling(s)");    
        
    System.out.print("\nHow tall are you (in feet)? "); // Ask user
    double height = kboard.nextDouble();              // Accept answer from user
    System.out.println("Just confirming that your are " + height + " feet tall");
    String bye = "\nThat's all. Thank you!"; // This is how a String variable is assigned
    System.out.println(bye);
    
    kboard.close(); // Done using the keyboard
  }
}
