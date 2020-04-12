import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

/**
 * This class creates and updates the distance score in the top right hand corner of the scren.
 *
 * @author (Yamuna Rao)
 * @version (1.0)
 */
public class DistanceScore extends Pane
{
    // instance variables
    private int distanceScore = 0;
    private Text score1;
    private Text score2;
    private int y = 0;

    //constructors
    /**
     * Constructor for objects of class DistanceScore
     */
    public DistanceScore()
    {
        score1 = new Text(430, 20, "Score:");
        score1.setFont(Font.font ("Toledo", 20));  //verdana
        score1.setFill(Color.DEEPPINK);
        score1.setStroke(Color.DEEPPINK);
        score1.setStrokeWidth(1);
        score2 = new Text(430, 60, "0");
        score2.setFont(Font.font ("Toledo", 40));  //verdana
        score2.setFill(Color.DEEPPINK);
        score2.setStroke(Color.DEEPPINK);
        score2.setStrokeWidth(3);
        distanceScore = 0;
        getChildren().add(score1);
        getChildren().add(score2);  
    }

    //methods
    /**
     * Updates the score
     */
    public void updateScore()
    {
        distanceScore++;
        getChildren().remove(score1);
        getChildren().remove(score2);
        score1 = new Text(430, 0, "Score:");
        score2 = new Text(430, -10, "\n" + distanceScore);
        score1.setTranslateY(y);
        score2.setTranslateY(y);
        score1.setFont(Font.font ("Toledo", 20));  //verdana
        score1.setFill(Color.DEEPPINK);
        score1.setStroke(Color.DEEPPINK);
        score1.setStrokeWidth(1);
        score2.setFont(Font.font ("Toledo", 40));  //verdana
        score2.setFill(Color.DEEPPINK);
        score2.setStroke(Color.DEEPPINK);
        score2.setStrokeWidth(3);
        getChildren().add(score1);
        getChildren().add(score2);
        y-=20;
    }
    
    /**
     * Returns the current distance score
     * @return distancescore The current distance score
     */
    public int getDistanceScore(){
        return distanceScore;
    }
}
