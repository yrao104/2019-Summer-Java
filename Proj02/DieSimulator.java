/* To generate random integers, construct an object of the Random class and apply
 * the nextInt method.(e.g. generator.nextInt(6) gives a # between 0 and 5
 * Write a program DieSimulator that uses the Random class to simulate the cast
 * of a die, printing a random number between 1 and 6 every time that the program
 * is run.
 */

import java.util.Random;

public class DieSimulator{
    public static void main(String[] args){
       Random randGen = new Random(); 
       int result = randGen.nextInt(6) + 1;
       System.out.print(result);
    }
}