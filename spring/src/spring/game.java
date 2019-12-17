package spring;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Lion", "Panther", "Hippopottamus", "Cat", "Dog"};

		int[] maxspeed = {45, 53, 37, 39, 41};	//tas * 0,1 for att bli ratt
		int[] minspeed = {35, 37, 33, 33, 35};

		double[] eatchance = { 0.13 , 0.23 , 0.02 , 0.03 , 0.09 };
		
		djur[] djuren = new djur[4];
		for (int i = 0; i < djuren.length; i++) {
			djuren[i].initilize(names[i], maxspeed, minspeed, eatchance);
		}
		
	}

}
