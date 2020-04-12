/* Write a program that intializes a string with "Mississippi". Then replace "i"
 * with "ii" and print the length of the resulting string. In that string, 
 * replace all "ss" with "s" and print the length of the resulting string.
 */

public class E23{
    public static void main(String[] args){
        String state = "Mississippi";
        String state1 = state.replace("i", "ii");
        System.out.println(state1);
        String state2 = state.replace("ss", "s");
        System.out.println(state2);
    }
}