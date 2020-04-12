
/**
 * Write a description of class Array1DChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Arrays;
public class Array1DChecker
{
    public static void main(String[] args){
        int[] numbers = new int[12];
        Random randint = new Random();
        for(int i = 0; i < 12; i++){
            int integer = (int) (Math.random() * (111)) - 20;
            System.out.println(integer);
            numbers[i] = integer;
        }
        
        
        for (int n : numbers) {
            System.out.print(n + ", ");
        }
        
        int extra = 0;
        
        extra = numbers[0];
        numbers[0] = numbers[11];
        numbers[11] = extra;
        System.out.println();
        for (int i = numbers.length - 1;  i >= 0; i--) {
            System.out.print( numbers[i] + ", ");
        }
        
        int maxVal = 0;
        int curVal = 0;
        for (int i = 0; i < 12; i++) {
            maxVal = numbers[0];
            curVal = numbers[i];
            if(curVal > maxVal){
                maxVal = curVal;
            }
        }
        
        int minVal = 0;
        for (int i = 0; i < 12; i++) {
            minVal = numbers[0];
            curVal = numbers[i];
            if(curVal < minVal){
                minVal = curVal;
            }
        }
        
        System.out.println("\nThe minimum is: " + minVal);
        System.out.println("The maximum is: " + maxVal);
        
        int total = 0;
        int value = 0;
        for (int i = 0; i < 12; i++) {
            value = numbers[i];
            total += value;
        }
        double average = total/12.0;
        System.out.println("The sum is: " + total);
        System.out.println("The average is: " + average);
        
        Arrays.sort(numbers);
        
        int search = Arrays.binarySearch(numbers, 5);
        String idk = Arrays.toString(numbers);
        System.out.println(idk);
        System.out.println(search);
        
        
        }
}
