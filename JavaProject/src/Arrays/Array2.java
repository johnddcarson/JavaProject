package Arrays;

import java.util.Arrays;
import java.util.Random;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = getRandomArray(10);
		Arrays.sort(myArray);
		System.out.println(Arrays.binarySearch(myArray, 10));
		System.out.println(Arrays.toString(myArray));

		String[] sArrayStrings = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Isaac",
				"Amy" };
		Arrays.sort(sArrayStrings);
		System.out.println(Arrays.toString(sArrayStrings));
		System.out.println("Position " + Arrays.binarySearch(sArrayStrings, "David"));

		String[] sArrayStrings2 = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Isaac",
				"Amy" };
		Arrays.sort(sArrayStrings2);
		System.out.println(Arrays.toString(sArrayStrings2));
		System.out.println("Position " + Arrays.binarySearch(sArrayStrings2, "David"));

		System.out.println(Arrays.equals(sArrayStrings, sArrayStrings2));
	}

	public static int[] getRandomArray(int len) {
		Random random = new Random(3);
		int[] randomArray = new int[len];

		for (int i = 0; i < len; i++) {

			randomArray[i] = random.nextInt(100);
		}

		return randomArray;

	}

}
