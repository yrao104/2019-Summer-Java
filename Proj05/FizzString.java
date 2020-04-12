/**
 * This class includes a method called fizzString.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class FizzString
{
public String fizzString(String str) {
  if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) != 'b'){
    return "Fizz";
  }
  else if(str.charAt(0) != 'f' && str.charAt(str.length() - 1) == 'b'){
    return "Buzz";
  }
  else if(str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b'){
    return "FizzBuzz";
  }
  else{
    return str;
  }
}

}