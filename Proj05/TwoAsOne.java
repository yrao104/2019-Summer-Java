/**
 * This class includes a method called twoAsOne.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class TwoAsOne
{
public boolean twoAsOne(int a, int b, int c) {
  if(a + b == c || b + c == a || a + c == b){
    return true;
  }
  else{
    return false;
  }
}

}