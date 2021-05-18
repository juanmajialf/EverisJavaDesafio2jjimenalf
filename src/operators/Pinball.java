package operators;

public class Pinball {

	public Pinball() {

	}

	public void launchBall() {
		int ball = (int) (Math.random() * 9 + 1);
		String score = null, reward;
		int credits = 0;

		if (ball <= 3) {
			System.out.println("Tu puntuacion ha sido muy baja " + ball);
			score = "bajo";
		} else if (ball > 3 && ball <= 6) {
			System.out.println("Tu puntuacion ha sido media " + ball);
			score = "medio";
		} else if (ball > 6) {
			System.out.println("Tu puntuacion ha sido alta " + ball);
			score = "alto";
		}

		reward = (score.equals("medio") || score.equals("alto")) ? "si" : "no";

		switch (score) {

		case "bajo":
			int i = 0;
			do {
				credits += ball;
				i++;
			} while (i <= 10);
			credits = ball + 10;
			System.out.println("Tus creditos = " + credits);
			break;
		case "medio":
			int j = 0;
			while (j <= 20) {
				credits += ball;
				j++;
			}
			credits = credits + 100;
			System.out.println("Tus creditos = " + credits);
			break;
		case "alto":
			for (int z = 0; z <= 30; z++) {
				credits += ball;
			}
			credits = credits + 150;
			System.out.println("Tus creditos = " + credits);
			break;
		}

		if (reward.equals("si"))
			System.out.println("Y has conseguido un premio");
		else
			System.out.println("No has conseguido premio");
	}

}
