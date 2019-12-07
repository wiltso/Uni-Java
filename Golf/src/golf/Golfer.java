package golf;
import java.util.*;

/*
 * Created by Willam Lindholm
 */
public class Golfer {

    private String name;
    private String club;
    
    int[] hol = new int[18];
   
    /*
     * Created by Krisse
     */
    public void addNamnAndClub(String player) {	//Sparar namnet ot spelarna och klubben
        System.out.println("What's player" + player + "s name?");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("What is the name of "  + name + "s Club? ");
        club = sc.next();
    }

    public String getName() {
    	return name;
    }
    public String getClub() {
    	return club;
    }
    
    public void Addscore(int whichHole, int Hits) {
    	hol[whichHole] = Hits;
    }
    
    public String getGolfersScore() {
    	String s = "";
    	for(int i = 0; i < hol.length; i++) {
    		if (hol[i] == 0) {
    			i = 100;
    		}else {
    			s = s + Integer.toString(hol[i]) + ", ";
    		}
		}
    	return name + "s score for the game is: " + s.substring(0, s.length()-2) ;
    }
    public int totalScore() {
    	int score = 0;
    	for(int i = 0; i < hol.length; i++) {
    		if (hol[i] == 0) {
    			i = 100;
    		}else {
    			score = score + hol[i];
    		}
		}
    	return score;
    }
    public String endScoreWithName() {
    	return name + " from " + club + " with: " + Integer.toString(totalScore());
    }
    public String middleScoreWithName() {
    	return "The score for " + name + " from " + club + " is: " + Integer.toString(totalScore());
    }
    
}