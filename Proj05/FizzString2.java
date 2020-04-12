/**
 * This class includes a method called fizzString2.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class FizzString2
{
public String fizzString2(int n) {
  if(n%3 == 0 && n%5 != 0){
    return "Fizz!";
  }
  else if(n%3 != 0 && n%5 == 0){
    return "Buzz!";
  }
  else if(n%3 == 0 && n%5 == 0){
    return "FizzBuzz!";
  }
  else{
    return n + "!";
  }
}

}