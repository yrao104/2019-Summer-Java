public class Words
{
   /**
      Returns the nth short word (length <= 3) in an array.
      @param words an array of strings
      @param n an integer > 0
      @return the nth short word in words, or the empty string if there is
      no such word
   */
   public String nthShortWord(String[] words, int n)
   {
      // your work here
      int count = 0;
      String shortWord = "";
      String minWord = "";
      for(int i = 0; i < words.length; i++){
         shortWord = words[i];
         if(shortWord.length() <= 3){
            minWord = shortWord;
            count++;
            if(count == n){
               break;
            }
         }
      }
      if(count == n){
            minWord = minWord;
         }
         else{
            minWord = "";
         }
      return minWord;
   }
}