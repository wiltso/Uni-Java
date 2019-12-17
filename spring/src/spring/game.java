package spring;

public class game {
	
	djur[] djuren = new djur[4];
	String format = "%1$-10s";
	
	public void runGame() {
		// TODO Auto-generated method stub
		initilize();
		boolean won = false;
		while (won == false) {
			System.out.println("hubaluba");
			won = run();
		}
		reset();
	}
	
	private void initilize() {
		String[] names = {"Lion", "Panther", "Hippo", "Cat", "Dog"};
		int[] maxspeed = {45, 53, 37, 39, 41};	//tas * 0,1 for att bli ratt
		int[] minspeed = {35, 37, 33, 33, 35};
		double[] eatchance = { 0.13 , 0.23 , 0.02 , 0.03 , 0.09 };
		
		for (int i = 0; i < djuren.length; i++) {
			djuren[i] = new djur();
			djuren[i].initilize(names[i], maxspeed[i], minspeed[i], eatchance[i]);
		}
		
		for (djur djuret:djuren) {	//för alla djuren
			djuret.getTheName();	//hämtar djurets namn med The
			
		}
	}
	
	private boolean run() {
		boolean someOneWon = false;
		for (djur djuret: djuren) {
			double runningTotal = djuret.run();
			System.out.format(format, runningTotal);
			if (someOneWon != true){
				someOneWon = djuret.won();
			}
		}
		return someOneWon;
	}
	
	private void reset() {
		for (djur djuret:djuren) {
			djuret.reset();
		}
	}

}
