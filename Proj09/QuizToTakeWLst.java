
/**
 * Write a description of class QuizToTakeWLst here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Scanner;
public class QuizToTakeWLst
{
    // instance variables - replace the example below with your own
    private static ArrayList<Question> quiz = new ArrayList<Question>();

    /**
     * Constructor for objects of class QuizToTakeWLst
     */
    public QuizToTakeWLst()
    {
        quiz = new ArrayList<Question>();
    }

    /**
     * Adds a question to the array list questions
     *
     * @param  questionGiven  A question object from the Question class
     */
    public static void addQuestion(String questionGiven, String answer)
    {
        Question qu = new Question();
        qu.setText(questionGiven);
        qu.setAnswer(answer);
        quiz.add(qu);
    }

    /**
     * Returns the quiz Array List by traversing
     *
     * 
     */
    public static void presentQuestion()
    {
        Scanner in = new Scanner(System.in);
        for (Question q: quiz)
        {
            q.display();
            String response = in.next();
            if (q.checkAnswer(response)) {
                System.out.println("Good job!");
            }
            else {
                System.out.println("Incorrect, but nice try.");
            }
        }

    }
    
    public static void main(String[] args){
       QuizToTakeWLst.addQuestion("What day is it?", "Monday");
       QuizToTakeWLst.addQuestion("What color is the sky?", "blue");
       QuizToTakeWLst.addQuestion("What is 2x2?", "4");
       QuizToTakeWLst.addQuestion("What is the thing you're typing on called?", "keyboard");
       QuizToTakeWLst.presentQuestion();
    }
}
