package Section6;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 50; i++) {

			if (isPrime(i)) {
				System.out.println("The Number " + i + " is prime " + isPrime(i));
				count++;
				if (count == 4) {
					System.out.println("Found " + count + " exiting loop");
					break;

				}

			}
		}
		System.out.println("Number of Prime numbers: " + count);
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