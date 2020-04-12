import java.util.Scanner;
/**
 * Write a description of class QuizToTake here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuizToTake
{
    public static void main(String[] args){
        ChoiceQuestion question = new ChoiceQuestion();
        question.setText("What is the largest state in the United States?");
        question.addChoice("California");
        question.addChoice("Texas");
        question.addChoice("Michigan");
        question.addChoice("New York");
        question.addChoice("Florida");
        question.setAnswer("2");
        
        question.display();
        System.out.print("Enter your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.next();
        
        if (question.checkAnswer(response)) {
          System.out.println("Good job!");
        }
        else {
            System.out.println("Incorrect, but nice try.");
        }
    }
}
