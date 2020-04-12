
/**
 * This class declares a String object, assingns it some text, and checks the methods.
 *
 * @author (Yamuna Rao, Arav Sachdeva)
 * @version (1.0)
 */
public class StringChecker
{
    public static void main(String[] args){
        String object;
        object = "Hello";
        System.out.println(object.length());
        System.out.println(object.substring(1,2));
        System.out.println(object.charAt(4));
        System.out.println(object.indexOf('e'));
        System.out.println(object.lastIndexOf('l'));
        System.out.println(object.toUpperCase());
        System.out.println(object.toLowerCase());
    }
}
