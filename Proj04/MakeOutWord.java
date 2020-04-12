
/**
 * This class includes a method called makeOutWord.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class MakeOutWord
{
   /**
    * Returns the string word inside of the string out.
    * @param out A 4 character string.
    * @param word A word
    * @return Returns the string word inside of the string out
    */
   public String makeOutWord(String out, String word) {
      return out.substring(0, 2) + word + out.substring(2, 4);
   }
}