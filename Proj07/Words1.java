import java.util.ArrayList;

public class Words1
{
   /**
      Returns all short words (length <= 3) in an array of words
      @param words an array of strings
      @return an array list containing the short words in words
   */
   public ArrayList<String> shortWords(String[] words)
   {
      ArrayList<String> shortWords = new ArrayList<String>();
      for(int i = 0; i < words.length; i++){
         if(words[i].length() <= 3){
            shortWords.add(words[i]);
         }
      }
      return shortWords;
   }
}