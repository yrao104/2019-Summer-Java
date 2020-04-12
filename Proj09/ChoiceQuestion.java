
/**
 * Write a description of class ChoiceQuestion here.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
import java.util.ArrayList;

public class ChoiceQuestion extends Question
{
    //Fields
    private ArrayList<String> answerChoices;
    
    //Constructors
    public ChoiceQuestion(){
        super();
        answerChoices = new ArrayList<String>();
    }
    
    /**
     * Adds an answer choice the the array of answer choices
     * @param answerChoice The String that represents your answer choice
     */
    public void addChoice(String answerChoice){
        answerChoices.add(answerChoice);
    }
    
    /**
     * Displays the question text as well as the answer choices numbered from 1 on.
     */
    public void display(){
       super.display();
       for(int i = 0; i < answerChoices.size(); i++){
           System.out.println(i + 1 + ": " + answerChoices.get(i));
       }
    }
   
}
