package spring;

public class game {
	
	djur[] djuren = new djur[4];
	
	public void runGame() {
		// TODO Auto-generated method stub
		System.out.println("ERDTFYGUHIJO");
		initilize();
		runGame();
		reset();
	}
	
	private void initilize() {
		String[] names = {"Lion", "Panther", "Hippopottamus", "Cat", "Dog"};
		int[] maxspeed = {45, 53, 37, 39, 41};	//tas * 0,1 for att bli ratt
		int[] minspeed = {35, 37, 33, 33, 35};
		double[] eatchance = { 0.13 , 0.23 , 0.02 , 0.03 , 0.09 };
		
		for (int i = 0; i < djuren.length; i++) {
			System.out.println(names[i]);
			System.out.println(maxspeed[i]);
			System.out.println(minspeed[i]);
			System.out.println(eatchance[i]);
			djuren[i].initilize(names[i], maxspeed[i], minspeed[i], eatchance[i]);
		}
		
		for (djur djuret:djuren) {
			djuret.getTheName();
		}
	}
	
	private void reset() {
		for (djur djuret:djuren) {
			djuret.reset();
		}
	}

}
