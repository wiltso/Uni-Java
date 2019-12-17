package spring;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String djurtyp {"Lion", "Panther", "Hippopottamus", "Cat", "Dog"};

		int maxSpeed { 45 ; 53 ; 37 ; 39 ; 41 };	//tas * 0,1 för att bli rätt
		int minSpeed {35 ; 37 ; 33 ; 33 ; 35};

		float eat { 0.13 ; 0.23 ; 0,02 ; 0,03 ; 0,09 };
		
		djur[] djuren = new djur[4];
		for (int i = 0; i < djuren.length; i++) {
			djuren[i].initilize(names[i], maxspeed, minspeed, eatchance);
		}
		
	}

}
