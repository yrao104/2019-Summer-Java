
/**
 * This class includes the method makeTags
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class MakeTags
{
    /**
    * Returns a string where the second string is drawn as italic text
    * @param tag A String
    * @param word A String
    * @return Returns word drawn as italic text
    */
    public String makeTags(String tag, String word) {
       return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
