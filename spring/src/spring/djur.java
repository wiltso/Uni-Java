package spring;

import java.util.Random;

public class djur {

	private static String djurName;
	private static double maxSpeed;
	private static double minSpeed;
	private double runningTotal = 0;
	private static int eat;

	public void initilize(String name, double maxspeed, double minspeed, double eatChance) {
		djurName = name;
		maxSpeed = maxspeed;
		minSpeed = minspeed;
		eat = (int) (eatChance * 100);
	}
	public double run() {
		Random rand = new Random(); 
		if (rand.nextInt(101) <= eat) {
			return -1.0;
		}
		else {
			double ran = minSpeed + (maxSpeed - minSpeed) * rand.nextDouble();
			runningTotal = runningTotal + ran;
			return runningTotal;
		}
	}
	public boolean won() {
		return runningTotal >= 1000;
	}

	public void reset() {
		runningTotal = 0;
	}
	public String getTheName() {
		return "The " + djurName;
	}
}