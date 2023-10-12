package Section_5;

import java.util.List;

public class Section5 {

	public static void main(String[] args) {

		double kilometers = (100 * 1.609344);

		int highScore = 50;

		if (highScore > 25) {
			highScore = 500 + highScore;

			System.out.println(highScore + " " + kilometers);
		}

		int health = 100;

		if ((health > 25) && (highScore < 1000)) {
			highScore = 555;

			System.out.println(highScore);
			highScore--;
			System.out.println(highScore);

			for (int i = highScore; i <= 560; i++) {
				// System.out.println(highScore++);
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

		System.out.println(displayHighScorePosition("John Carson", calculateHighScorePosition(1500)));
		System.out.println(displayHighScorePosition("Bob Carson", calculateHighScorePosition(999)));
		System.out.println(displayHighScorePosition("Jack Carson", calculateHighScorePosition(499)));
		System.out.println(displayHighScorePosition("Jim Carson", calculateHighScorePosition(99)));
		System.out.println(displayHighScorePosition("Heather Carson", calculateHighScorePosition(-2)));

		System.out.println("Miles Per Hour " + toMilesPerHour(1.5));
		System.out.println("Miles Per Hour " + toMilesPerHour(10.25));
		System.out.println("Miles Per Hour " + toMilesPerHour(-5.6));
		System.out.println("Miles Per Hour " + toMilesPerHour(25.42));
		System.out.println("Miles Per Hour " + toMilesPerHour(75.114));
		System.out.println();

		printConversion(0.0);
		printConversion(1.5);
		printConversion(10.25);
		printConversion(-5.6);
		printConversion(25.42);
		printConversion(75.114);

		System.out.println();
		System.out.println();

		printMegaBytesAndKiloBytes(0);
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-2500);
		printMegaBytesAndKiloBytes(5000);

		System.out.println(hasTeen(List.of(9, 99, 19)));
		System.out.println(hasTeen(List.of(23, 15, 42)));
		System.out.println(hasTeen(List.of(22, 23, 34)));
	}

	public static int calculateScore(int levelCompleted, int bonus) {

		return levelCompleted * bonus;
	}

	public static int calculateScore(int levelCompleted, int bonus, int ExtraBonus) {

		return (levelCompleted * bonus) + ExtraBonus;
	}

	public static int calculateHighScorePosition(int playerScore) {

		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500) {
			return 2;
		} else if (playerScore >= 100) {
			return 3;
		}
		return 4;

	}

	public static String displayHighScorePosition(String playerName, int playerPosition) {

		return "The players name is " + playerName + " and their position is " + playerPosition;
	}

	public static void checkNumber(int number) {

		if (number > 0) {
			System.out.println("positive");
		} else if (number < 0) {
			System.out.println("negative");
		} else if (number == 0) {
			System.out.println("zero");
		}

	}

	public static long toMilesPerHour(double kilometersPerHour) {

		if (kilometersPerHour > 0) {
			return Math.round(kilometersPerHour * 0.62137);
		}

		return -1;
	}

	public static void printConversion(double kilometersPerHour) {
		double mph = Math.round(kilometersPerHour / 1.609344);

		if (mph >= 0) {
			System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
		} else
			System.out.println("Invalid Value");
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes >= 0) {
			System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB");
		} else {
			System.out.println("Invalid Value");
		}
	}

	public static boolean hasTeen(List<Integer> ages) {

		for (Integer age : ages) {

			if (age >= 13 && age <= 19) {

				return true;
			}

		}
		return false;
	}
}
