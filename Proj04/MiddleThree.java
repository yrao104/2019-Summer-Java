
/**
 * This class includes the method middleThree
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class MiddleThree
{
    /**
    * Returns the middle 3 letters of a string
    * @param str A String
    * @return Returns the middle 3 letters of the string str
    */
    public String middleThree(String str) {
       return str.substring(str.length()/2-1, str.length()/2+2);
    }

}
