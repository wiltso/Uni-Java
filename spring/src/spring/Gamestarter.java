package spring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Gamestarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game thegame = new game();
		thegame.runGame();
		
		/*
		 * For testing
		thegame.initilize();
		for(int i = 0; i<5000000;i++) {
			thegame.runGame();
		} 
		int hippo = 0;
		int lion = 0;
		int bunny = 0;
		int panther = 0;
		int cat = 0;
		int dog = 0;
		
		int win1 = 0;
		int win2 = 0;
		int win3 = 0;
		int win4 = 0;
		int win5 = 0;
		int win6 = 0;
		
		
		for(int i = 0; i<5000000;i++) {
			if (thegame.unsortedPlayers.get(i).contains("The Hippo")){
				hippo = hippo + 1;
			}
			if (thegame.unsortedPlayers.get(i).contains("The Lion")){
				lion = lion + 1;
			}
			if (thegame.unsortedPlayers.get(i).contains("The Cat")){
				cat = cat + 1;
			}
			if (thegame.unsortedPlayers.get(i).contains("The Dog")){
				dog = dog + 1;
			}
			if (thegame.unsortedPlayers.get(i).contains("The Panther")){
				panther = panther + 1;
			}
			if (thegame.unsortedPlayers.get(i).contains("The Bunny")){
				bunny = bunny + 1;
			}
			List<String> list = Arrays.asList(thegame.unsortedPlayers.get(i).split(" "));
			if (Collections.frequency(list, "and") == 1) {
				win1 = win1 + 1;
			}
			if (Collections.frequency(list, "and") == 2) {
				win2 = win2 + 1;
			}
			if (Collections.frequency(list, "and") == 3) {
				win3 = win3 + 1;
			}
			if (Collections.frequency(list, "and") == 4) {
				win4 = win4 + 1;
			}
			if (Collections.frequency(list, "and") == 5) {
				win5 = win5 + 1;
			}
			if (Collections.frequency(list, "and") == 6) {
				win6 = win6 + 1;
			}
			//System.out.println(thegame.unsortedPlayers.get(i));
		}
		System.out.println("1 winner: " + Integer.toString(win1));
		System.out.println("2 winner: " + Integer.toString(win2));
		System.out.println("3 winner: " + Integer.toString(win3));
		System.out.println("4 winner: " + Integer.toString(win4));
		System.out.println("5 winner: " + Integer.toString(win5));
		System.out.println("6 winner: " + Integer.toString(win6));
		
		System.out.println("dog won: " + Integer.toString(dog));
		System.out.println("cat won: " + Integer.toString(cat));
		System.out.println("hippo won: " + Integer.toString(hippo));
		System.out.println("lion won: " + Integer.toString(lion));
		System.out.println("panther won: " + Integer.toString(panther));
		System.out.println("bunny won: " + Integer.toString(bunny));
		*/
	}

}
