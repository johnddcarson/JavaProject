package Section6;

public class Sum3and5 {

	public static void main(String[] args) {
		int count = 1;
		int numbersFound = 0;
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {

			if (numbersFound == 5) {
				break;
			}
			if (count % 3 == 0 && count % 5 == 0) {
				System.out.println("Number can be divided by both 3 and 5: " + count);
				numbersFound++;
				sum += count;
			}
			count++;
		}
		System.out.println("Sum of all numbers found: " + sum);
	}

	public static boolean isPrime(int wholeNumber) {
		if (wholeNumber <= 1) {
			return false; // 0 and 1 are not prime numbers
		}

		if (wholeNumber <= 3) {
			return true; // 2 and 3 are prime numbers
		}

		if (wholeNumber % 2 == 0 || wholeNumber % 3 == 0) {
			return false; // Divisible by 2 or 3, not prime
		}

		for (int i = 5; i * i <= wholeNumber; i += 6) {
			if (wholeNumber % i == 0 || wholeNumber % (i + 2) == 0) {
				return false; // Divisible by i or i + 2, not prime
			}
		}

		return true; // If no divisors found, it's a prime number
	}
}