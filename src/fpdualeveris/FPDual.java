package fpdualeveris;

import operators.Pinball;

/**
 * Clase principal
 * 
 * @autor Juan Manuel Jimenez Alfaro
 */
public class FPDual {
	/**
	 * Metodo principal
	 * 
	 * @param arg
	 */
	public static void main(String[] args) {
		// Ejecucion del desafio
		operatorChallenge();

	}

	/**
	 * Metodo de ejecucion
	 * 
	 */
	private static void operatorChallenge() {

		Pinball p = new Pinball();

		if (p instanceof Pinball)
			p.launchBall();

	}

}
