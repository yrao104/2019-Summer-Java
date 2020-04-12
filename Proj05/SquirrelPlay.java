/**
 * This class includes a method called squirrelPlay.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class SquirrelPlay
{
   public boolean squirrelPlay(int temp, boolean isSummer) {
  if(temp >= 60 && temp <= 90 && isSummer != true){
    return true;
  }
  else if(isSummer == true && temp >= 60 && temp <= 100){
    return true;
  }
  else{
    return false;
  }
}
}