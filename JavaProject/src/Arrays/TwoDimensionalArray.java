package Arrays;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dimArray = { { 1, 2, 3, 98 }, { 3, 2, 1 } };

		System.out.println(Arrays.deepToString(dimArray));

		for (int i = 0; i < dimArray.length; i++) {
			var innerArray = dimArray[i];
			for (int j = 0; j < innerArray.length; j++) {
				System.out.println(innerArray[j] + " ");

			}
		}
		System.out.println("_".repeat(14));

		for (int[] outer : dimArray) {
			System.out.println(Arrays.toString(outer));
		}
		System.out.println("_".repeat(14));

		Object[] anyArray = new Object[3];
		System.out.println(Arrays.toString(anyArray));

		anyArray[0] = new String[] { "a", "b", "c" };
		System.out.println(Arrays.deepToString(anyArray));

		anyArray[1] = new String[][] { { "1", "2" }, { "3", "4", "5" }, { "6", "7", "8", "9" } };
		System.out.println(Arrays.deepToString(anyArray));

		anyArray[2] = "Hello";
		System.out.println(Arrays.deepToString(anyArray));

		for (int i = 0; i < anyArray.length; i++) {
			var innerArray = anyArray[i];
			for (int j = 0; j < 2; j++) {
				System.out.println(innerArray.getClass().getName() + " ");

			}
		}

	}

}
