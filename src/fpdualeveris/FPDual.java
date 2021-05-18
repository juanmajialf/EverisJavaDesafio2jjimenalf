package fpdualeveris;

import operators.Pinball;

public class FPDual {

	public static void main(String[] args) {
		operatorChallenge();

	}
	
	private static void operatorChallenge() {
	
		Pinball p = new Pinball();
		
		if (p instanceof Pinball)
			p.launchBall();
		
	}

}

