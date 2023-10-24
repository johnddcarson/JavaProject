package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array {

	public static void main(String[] args) {

		int[] sendArray = new int[5];
		System.out.println("Test " + Arrays.toString(sendArray));
		Random random = new Random(100);
		Arrays.fill(sendArray, random.nextInt(10));
		System.out.println("Test " + Arrays.toString(sendArray));

		int[] scoreArray = new int[] { 9, 8, 7, 4, 5, 6, 4, 5, 5, 6 };

		for (int score : scoreArray) {
			if (score == 9) {
				System.out.print("Array Example ");
			}
			System.out.print(score + ", ");
		}

		System.out.println(scoreArray[9]);
		System.out.println();
		ArrayList<Integer> myList = new ArrayList<>();

		for (int i = 1; i < 11; i++) {
			myList.add(i);
		}

		for (int element : myList) {
			if (element == 1) {
				System.out.print("Array List Example ");
			}
			System.out.print(element + ", ");
		}
		System.out.println();
		int[] arrayLoop = new int[5];

		for (int i = 0; i < arrayLoop.length; i++) {
			arrayLoop[i] = arrayLoop.length - i;
		}
		for (int loop : arrayLoop) {
			System.out.print(loop + ", "); // Access and print elements
			System.out.print(arrayLoop);
		}
		System.out.println();
		System.out.println(Arrays.toString(scoreArray));
		int j = 20;
		System.out.println(j % 10 + " Module");

		int[] randomArray = getRandomArray(2500000);
		int index = 0;
		System.out.println(Arrays.toString(randomArray));
		Arrays.sort(randomArray);
		System.out.println(Arrays.toString(randomArray));

		for (int rando : randomArray) {

			if (index % 10 == 0) {
				System.out.println();
			}
			System.out.printf("%4d", rando);
			index++;

		}

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
