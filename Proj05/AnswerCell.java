/**
 * This class includes a method called answerCell.
 *
 * @author (Yamuna)
 * @version (1.0)
 */
public class AnswerCell
{
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isMorning == true && isMom == true && isAsleep == false){
    return true;
  }
  else if(isMorning == false && isAsleep == false){
    return true;
  }
  else if(isAsleep == true){
    return false;
  }
  else if(isMorning == true && isMom == false){
    return false;
  }
  else{
    return true;
  }
}

}