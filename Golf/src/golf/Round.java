package golf;

import java.util.*;
import java.lang.Error;

public class Round {
	
	Golfer[] golfers = new Golfer[4];
	
	int onHole = 0;
	/*
	 * Created by krisse
	 */
	public void initializeGame() {
		
        for (int i=0; i < golfers.length; i++) {
        	golfers[i] = new Golfer();
        	golfers[i].addNamnAndClub(Integer.toString(i+1));
        }
        next();
    }
	/*
	 * Created by krisse
	 */
	public void next() {
        while (onHole < 18) {
        	if (onHole == 0){
        		addSlag();
			}	
        	System.out.println("What would you like to do next?\nType M to get Mellanresultat or N for Next round? ");
            Scanner sc = new Scanner (System.in);
            String s1 = sc.next();
			
            if (s1.equalsIgnoreCase("n")||s1.equalsIgnoreCase("next")||s1.equalsIgnoreCase("next round")) {
			    addSlag();
			}
			else if(s1.equalsIgnoreCase("m")||s1.equalsIgnoreCase("mellanresultat")) {
			    printScore();
			}
			else {
			    System.out.println("Please answer either M to get Mellanresultat or N for Next round");
			}
		}
        printFinalScore();
    }
	
	/*
	 * Created by krisse
	 */
    public void addSlag() {
    	for(int i = 0; i < golfers.length; i++) {
	        int s = 0;
	        boolean run = true;
	        Scanner sc = new Scanner(System.in);

	        while (run){
	            try {
	            	System.out.print("Enter the score for hole " + Integer.toString(onHole + 1) + " for player " + golfers[i].getName() + " from " + golfers[i].getClub() +": ");
	            	String input = sc.next();
	                s = Integer.parseInt(input);
	                
	                // William Lindholm
	                if (s < 1) {
	                	throw new java.lang.Error("Player must have hit at least one time");
	                }
	                run = false;
	            } 
	            catch(NumberFormatException e){
	            	System.out.println("Wrong input new try!");
	            }
	            // William Lindholm
	            catch(Error e) {
	            	System.out.println("Player must have hit at least one time... New try");
	            }
	        }
	        golfers[i].Addscore(onHole, s);
	    }
    	onHole = onHole + 1;
    }

    /* 
     * Sorts the HashMap by value
     * Created by William Lindholm
     */
    public static List<Map.Entry<Integer, Integer> > sortByValue(HashMap<Integer, Integer> map) {

        // Creates a list from the elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = new LinkedList<Map.Entry<Integer, Integer> >(map.entrySet()); 

        // Sorts the list with a lambda function
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
        return list; 
    } 

    /*
     * Prints all of the players score in the sorted order
     * Created by William Lindholm
     */
    public void printScore() {
    	HashMap<Integer, Integer> unsortedPlayers = new HashMap<Integer, Integer>();
    	for(int i = 0; i < golfers.length; i++) {
    		unsortedPlayers.put(i, golfers[i].totalScore());
    	}
    	
    	List<Map.Entry<Integer, Integer> > playerList = sortByValue(unsortedPlayers);    	
    	
        for (Map.Entry<Integer, Integer> a : playerList) {
        	System.out.println(golfers[a.getKey()].middleScoreWithName()); 
        }
    }

    /*
     * Prints the final score and who won
     * Created by William Lindholm
     */
    public void printFinalScore() {
    	HashMap<Integer, Integer> unsortedPlayers = new HashMap<Integer, Integer>();
    	for(int i = 0; i < golfers.length; i++) {
    		unsortedPlayers.put(i, golfers[i].totalScore());
    	}
    	
    	List<Map.Entry<Integer, Integer> > playerList = sortByValue(unsortedPlayers);    	
    	
        for (Map.Entry<Integer, Integer> a : playerList) { 
        	System.out.println(golfers[a.getKey()].getGolfersScore()); 
        }
        String[] place = {"First place gose to ", "Second place gose to ", "Third place gose to ", "Fourth place gose to "};
        int onPlace = 0;
        
        for (Map.Entry<Integer, Integer> a : playerList) { 
        	System.out.println(place[onPlace] + golfers[a.getKey()].endScoreWithName());
        	onPlace = onPlace + 1;
        }
        
    }
}

