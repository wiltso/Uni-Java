package spring;

import java.util.Random;

public class djur {

	private static String djurName;
	private static double maxSpeed;
	private static double minSpeed;
	private double runningTotal = 0;
	private static int eat;

	public void initilize(String name, int maxspeed, int minspeed, double eatChance) {
		System.out.println(eatChance);
		djurName = name;
		eat = (int) (eatChance * 100);
		
	}
	public double run() {
		Random rand = new Random(); 
		if (rand.nextInt(101) >= eat) {
			return -1.0;
		}
		else {
			double ran = minSpeed + (maxSpeed - minSpeed) * rand.nextDouble();
			runningTotal = runningTotal + ran;
			return runningTotal;
		}
	}
	public boolean won() {
		if (runningTotal > 1000) {
			return true;
		}
		else {
			return false;
		}
	}
	public void reset() {
		runningTotal = 0;
	}
	public String getTheName() {
		return "The " + djurName;
	}
}