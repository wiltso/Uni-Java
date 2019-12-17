package spring;

public class game {
	
	djur[] djuren = new djur[4];
	String format = "%1$-40s";
	
	public void runGame() {
		// TODO Auto-generated method stub
		initilize();
		boolean won = false;
		while (won == false) {
			System.out.println();
			won = run();
		}
		reset();
	}
	
	private void initilize() {
		String[] names = {"Lion", "Panther", "Hippo", "Cat", "Dog"};
		double[] maxspeed = {4.5, 5.3, 3.7, 3.9, 4.1};	//tas * 0,1 for att bli ratt
		double[] minspeed = {3.5, 3.7, 3.3, 3.3, 3.5};
		double[] eatchance = { 0.13 , 0.23 , 0.02 , 0.03 , 0.09 };
		
		for (int i = 0; i < djuren.length; i++) {
			djuren[i] = new djur();
			djuren[i].initilize(names[i], maxspeed[i], minspeed[i], eatchance[i]);
		}
		
		for (djur djuret:djuren) {	//fr alla djuren
			System.out.format(format, djuret.getTheName());
			djuret.getTheName();	//hmtar djurets namn med The
			
		}
	}
	
	private boolean run() {
		boolean someOneWon = false;
		for (djur djuret: djuren) {
			double runningTotal = djuret.run();
			if (runningTotal == -1.0) {
				System.out.format(format, "Eat");
			}else {
				System.out.format(format, runningTotal);
			}
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
