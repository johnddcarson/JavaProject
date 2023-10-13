package Section6;

import java.util.Scanner;

public class NewScanner {

	public static void main(String[] args) {
		inputThenPrintSumAndAverage();

	}

	public static void inputThenPrintSumAndAverage() {

		int number = 0;
		int sumOfNumbers = 0;
		int counter = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Please enter a number: ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				sumOfNumbers += number;
				counter++;
			} else {
				break;
			}
		}
		double average = 0;
		if (counter == 0) {
			average = 0;
		} else {
			average = sumOfNumbers / counter;
		}

		// scanner.close();
		System.out.println("The total sum total is: " + sumOfNumbers);
		System.out.println("The total average  is: " + average);

	}

}
