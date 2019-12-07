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
     * Created by Kristina Causton
     */
    public void addNamn() {                    //Sparar namnet ot spelarna
        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
    }
    /*
     * Created by Kristina Causton
     */
    public void addKlubb() {                // Ge golfern en klubb
        System.out.println("What is the name of your Club? ");
        Scanner sc = new Scanner (System.in);
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
    	s = s.substring(0, s.length()-2);
    	s = s + " total score for " + name + " from " + club + " is: " + Integer.toString(totalScore());
    	return s;
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
    public String scoreWithName() {
    	return "score for " + name + " from " + club + " is: " + Integer.toString(totalScore());
    }
    
}