
/**
 * This class includes the method left2
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class Left2
{
    /**
    * Returns a string where the first 2 chars are moved to the end
    * @param str A String
    * @return Returns str with the first 2 chars moved to the end
    */
    public String left2(String str) {
       return str.substring(2, str.length()) + str.substring(0, 2);
    }
}
