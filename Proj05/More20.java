
/**
 * This class includes a method called caughtSpeeding.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class More20
{
   /**
    * Returns true if the given non-negative number is 1 or 2 more than a multiple of 20.
    * @param n Integer
    * @return Returns true or false
    */
   public boolean more20(int n) {
  if(n%20 == 1 || n%20 == 2){
    return true;
  }
  else{
    return false;
  }
   }
}