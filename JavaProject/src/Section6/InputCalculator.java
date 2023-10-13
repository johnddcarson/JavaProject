package Section6;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = 1;
		int sumOfNumbers = 0;
		int userEnteredValue = 0;
		// System.out.print("Please enter 5 Valid numbers ");
		// String name = scanner.nextLine();

		while (number <= 5) {

			try {
				System.out.println("Please enter value number " + number);
				userEnteredValue = scanner.nextInt();
				sumOfNumbers += userEnteredValue;
				number++;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.next();
			}

		}
		scanner.close();
		System.out.println("The total sum total is: " + sumOfNumbers);

	}

}