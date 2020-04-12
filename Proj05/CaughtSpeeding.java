
/**
 * This class includes a method called caughtSpeeding.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class CaughtSpeeding
{
   /**
    * Returns 0, 1, or 2 based on the ticket you get for speeding
    * @param speed Speed
    * @param isBirthday If it is your birthday
    * @return Returns 0, 1, or 2
    */
   public int caughtSpeeding(int speed, boolean isBirthday) {
  if(speed <= 60 || isBirthday == true && speed <= 65){
    return 0;
  }
  else if(speed >= 61 && speed <= 80 || isBirthday == true && speed >= 61 && speed <= 85){
    return 1;
  }
  else{
    return 2;
  }
  }

}