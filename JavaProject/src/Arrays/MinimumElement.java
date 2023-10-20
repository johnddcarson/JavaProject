package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {

		// int[] mainArray = readItegers();
		// System.out.println(Arrays.toString(mainArray));
		// Arrays.sort(mainArray);
		// System.out.println(Arrays.toString(mainArray));
		// System.out.println("Min " + findMin(mainArray));
		// System.out.println("Max " + findMax(mainArray));
		int[] reverseArray = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(reverseArray));
		reverseArray(reverseArray);
		System.out.println(Arrays.toString(reverseArray));

	}

	public static int[] readItegers() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a list of numbers,sparated by commas");
		String inputString = scanner.nextLine();
		String[] stringSplit = inputString.split(",");
		int[] intArray = new int[stringSplit.length];

		for (int i = 0; i < stringSplit.length; i++) {
			intArray[i] = Integer.parseInt(stringSplit[i].trim());
		}
		return intArray;

	}

	private static int findMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	private static int findMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	private static void reverseArray(int[] array) {
		int maxIndex = array.length - 1;

		for (int i = 0; i < array.length / 2; i++) {
			// Swap elements at index i and maxIndex
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}

}
