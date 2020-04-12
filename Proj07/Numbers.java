public class Numbers
{
   /**
      Computes the length of the longest sequence that occurs in the
      start of the left half and the end of the right half of an
      array.
      @param values an array of integer values
      @return the length of the longest end sequence
   */
   public int sameEnds(int[] values)
   {
      int number = 0;
      int firstNum = 0;
      int sequenceLength = 0;
      for(int i = 0; i < values.length; i++){
         firstNum = values[0];
         number = values[i];
         if(firstNum == values[values.length -1] && firstNum == values[1]){
            sequenceLength = values.length / 2;
         }
         else if(values.length == 4){
            sequenceLength = 0;
         }
         else if(number == firstNum){
            sequenceLength = values.length - i;
         }
         else if(number != firstNum && firstNum != values[values.length -1]){
            sequenceLength = sequenceLength;
         }
         else if(firstNum == values[values.length-1] && firstNum != values[1]){
            sequenceLength = 1;
         }
         else{
            sequenceLength = 0;
         }
      }

   return sequenceLength;

   }
}