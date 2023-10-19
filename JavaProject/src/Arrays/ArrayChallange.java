package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayChallange {

	public static void main(String[] args) {

		int[] myIntArray = new int[5];
		int[] myIntArray2 = myIntArray;

		int[] challangeArray = getRandomArray(3);

		System.out.println(Arrays.toString(challangeArray));
		Arrays.sort(challangeArray);
		System.out.println(Arrays.toString(challangeArray));
		int printnumber = challangeArray.length - 1;

		for (int i = 0; i < challangeArray.length; i++) {
			System.out.print(challangeArray[printnumber] + ", ");
			printnumber--;

		}

		int howBigIsYourArray;
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("How big do you want your array?");
		howBigIsYourArray = sc.nextInt();

		int[] myArray = new int[howBigIsYourArray];

		for (int i = 0; i < howBigIsYourArray; i++) {
			System.out.println("Please enter Element " + (i + 1) + " of " + howBigIsYourArray);
			myArray[i] = sc.nextInt();

		}
		printArray(myArray);

	}

	public static int[] getRandomArray(int len) {
		Random random = new Random(3);
		int[] randomArray = new int[len];

		for (int i = 0; i < len; i++) {

			randomArray[i] = random.nextInt(100);
		}

		return randomArray;

	}

	public static void printArray(int[] array) {
		Arrays.sort(array);
		int printnumber = array.length - 1;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " contents " + array[printnumber] + ", ");
			printnumber--;

		}

	}

}
