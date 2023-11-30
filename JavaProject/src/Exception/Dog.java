package Exception;

import java.util.Arrays;

public class Dog extends Animal {
	static {
		String v = null;
		v.length();
	}

	@Override
	int legs(int numberOfLegs) throws Exception {

		if (numberOfLegs > 4) {

			// throw new IllegalArgumentException("Number of legs cannot be greater than
			// 4");
			throw new Exception("Too many legs");

		} else {
			return numberOfLegs;
		}
	}

	int legs2(int numberOfLegs) {

		try {
			if (numberOfLegs > 4) {
				throw new Exception("Number of legs cannot be greater than 4");
			}
			return numberOfLegs;
		} catch (Exception e) { // Handle the exception or rethrow it
			System.out.println("Exception: " + e.getMessage());
			return -1; // or throw a different exception if needed
		}
		System.out.println("yES");
	}

	public void arrayMethod(int index) throws ArrayIndexOutOfBoundsException {

		int[] array = new int[10];
		String str = null;
		Arrays.fill(array, 50);
		// System.exit(0);
		array[9] = 28;

		if (index >= array.length) {
			throw new ArrayIndexOutOfBoundsException(
					"Index out of bounds: " + index + " index must be less than " + array.length);
		}

		if (str == null) {
			throw new NullPointerException("The string is NULL");
		}

		System.out.println(array[index]);
		System.out.println("Does it get here");

	}

	public static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}

}