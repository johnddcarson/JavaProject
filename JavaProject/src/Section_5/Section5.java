package Section_5;

public class Section5 {

	public static void main(String[] args) {

		double kilometers = (100 * 1.609344);

		int highScore = 50;

		if (highScore > 25) {
			highScore = 500 + highScore;

			System.out.println(highScore);
		}

		int health = 100;

		if ((health > 25) && (highScore < 1000)) {
			highScore = 555;

			System.out.println(highScore);
			highScore--;
			System.out.println(highScore);

			for (int i = highScore; i <= 560; i++) {
				System.out.println(highScore++);
			}
		}

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 200;

		int finalScore = 0;

		if (gameOver) {
			finalScore = calculateScore(levelCompleted, bonus);
			System.out.println("Your final score was " + finalScore);
			finalScore = calculateScore(levelCompleted, bonus, 500);
			System.out.println("Your final score was " + finalScore);
		}

	}

	public static int calculateScore(int levelCompleted, int bonus) {

		return levelCompleted * bonus;
	}

	public static int calculateScore(int levelCompleted, int bonus, int ExtraBonus) {

		return (levelCompleted * bonus) + ExtraBonus;
	}

}
