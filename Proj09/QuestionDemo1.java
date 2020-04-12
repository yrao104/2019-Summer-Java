import java.util.Scanner;

/**
   This program shows a simple quiz with two question types.
*/
public class QuestionDemo1
{
   public static void main(String[] args)
   {
      Question q1 = new Question();
      q1.setText("Who was the inventor of Java?");
      q1.setAnswer("James Gosling");      

      presentQuestion(q1);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static void presentQuestion(Question q)
   {
      System.out.println();
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      if (q.checkAnswer(response)) {
          System.out.println("Good job!");
        }
        else {
            System.out.println("Incorrect");
        }
   }
}

