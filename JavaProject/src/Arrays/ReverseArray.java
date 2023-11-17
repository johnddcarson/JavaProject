package Arrays;

import java.util.Arrays;

public class ReverseArray {

	private static void reverse(int[] r) {
		int length = r.length - 1;

		int[] tempArray = Arrays.copyOf(r, r.length);
		int counter = 0;
		Arrays.fill(r, 0);
		for (int i = length; i >= 0; i--) {
			r[counter] = tempArray[i];
			counter++;

		}

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(array));
		reverse(array);

		System.out.println(Arrays.toString(array));

	}

}
