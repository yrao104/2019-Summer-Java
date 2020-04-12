public class Words
{
   /**
      Gets the middle character or character pair from this word 
      when possible.
      @param word a word
      @return the middle character (if the word length is odd) or
      middle two characters (if it is even), or the empty string if 
      the word is empty, or null if it is null.
   */
   public String getMiddle(String word)
   {
      // your work here
      if(word == ""){
         return word;
      }
      else if(word == null){
         return word;
      }
      else if(word.length()%2 == 0){
         return word.substring(word.length()/2 - 1, word.length()/2 + 1);
      }
      else //if(word.length()%2 == 1)
      {
         return word.substring(word.length()/2, word.length()/2 + 1);
      }
   }
}