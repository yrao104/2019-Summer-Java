
/**
 * This class includes the method nonStart.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class NonStart
{
    /**
    * Returns the string a without the first character and the string b without the first character.
    * @param a A String
    * @param b A String
    * @return Returns the string a without the first character and the string b without the first character.
    */
    public String nonStart(String a, String b) {
      return a.substring(1, a.length()) + b.substring(1, b.length());
    }

}
