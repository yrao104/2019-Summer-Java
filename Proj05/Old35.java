/**
 * This class includes a method called old35.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class Old35
{
public boolean old35(int n) {
  if((n%3 == 0 && n%5 != 0) || (n%3 != 0 && n%5 == 0)){
    return true;
  }
  else{
    return false;
  }
}

}