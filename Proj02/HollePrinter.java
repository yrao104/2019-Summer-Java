/* Write a program HollePrinter that switches the letters "e" and "o" in a 
 * string. Use the replace method repeatedly. Demonstrate that the string "Hello
 * , World" turns into "Holle, World!"
 */

public class HollePrinter{
    public static void main(String[] args){
        String portion1 = "He";
        String portion2 = "llo, ";
        String portion3 = "World!";
        String newPortion1 = portion1.replace("e", "o");
        String newPortion2 = portion2.replace("o", "e");
        System.out.println(portion1 + portion2 + portion3);
        System.out.println(newPortion1 + newPortion2 + portion3);
        
        
    }
}