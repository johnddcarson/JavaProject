package Section6;

public class Looping {

	public static void main(String[] args) {

		double amount = 100;

		for (double i = 7.5; i <= 10; i += 0.25) {
			if (i == 9.5) {
				break;
			}
			System.out.println("10,000 at " + i + " % interest = " + calculateInterest(amount, i));

		}

	}

	public static double calculateInterest(double amount, double interestRate) {

		return (amount * (interestRate / 100));

	}

}