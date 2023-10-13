package Section6;

public class SumOddRange {

	public static void main(String[] args) {

		System.out.println(sumOdd(100, 1000));

	}

	public static boolean isOdd(int number) {

		if (number < 0) {
			return false;
		}
		if (number % 2 != 0) {
			return true;
		}
		return false;

	}

	public static int sumOdd(int start, int end) {
		int sumOdd = 0;
		for (int i = start; i <= end; i++) {

			if (isOdd(i)) {
				sumOdd += i;

			}
		}

		return sumOdd;
	}
}