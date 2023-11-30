package OnlineQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Car2 c1 = new Car2("Auto");

		System.out.println(c1.type);
		System.out.println(c1.maxSpeed);
		System.out.println(c1.trans);

		StringBuilder sb = new StringBuilder("Java");
		String s = "Java";

		String ta = "A ";

		ta = ta.concat("B ");

		System.out.println(ta);

		String tb = "C ";

		ta = ta.concat(tb);

		System.out.println(ta);

		ta.replace('C', 'D');
		System.out.println(ta);

		ta = ta.concat(tb);

		System.out.println(ta);

		int num = 5;

		do {
			System.out.println(num-- + " ");

		} while (num == 0);

		int x = 103;
		int a = 100;
		int b = 102;
		int c = 102;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : x;

		System.out.println(x);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		short s1 = 200;
		Integer s2 = 400;

		String s3 = String.valueOf(s2);

		System.out.println(s3);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);

		System.out.println(list1.toString());

		// Create the second ArrayList
		ArrayList list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);

		System.out.println(list1.equals(list2));
		int[] array1 = { 10, 20 };

		// Create the second array
		int[] array2 = array1;

		System.out.println(array1.equals(array2));

		long xl = 100l;

		int fg = (int) (xl * s2);

		int[] numbers = { 2, 4, 6, 8 };
		Arrays.sort(numbers);

		System.out.println(Arrays.binarySearch(numbers, 3));

		System.out.println(Arrays.toString(numbers));

		String[] strings = { "10", "9", "100", "2b", "B" };
		Arrays.sort(strings);
		for (String string : strings) {
			System.out.print(string + " ");
		}

		ArrayList list11 = new ArrayList();
		ArrayList list22 = new ArrayList(10);
		ArrayList list33 = list11;

		System.out.println(list11 == list33);

	}

}
