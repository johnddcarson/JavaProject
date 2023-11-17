package A1Z0808;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		String a = "";
		String s = "Hello";
		s += "Hello";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse")
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");
		if ("2cfalse" == a)
			System.out.println("==");
		if ("Hello" == s)
			System.out.println("==");

		int total = 0;
		StringBuilder letters = new StringBuilder("0123456789");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		// total += letters.substring(6, 5).length();
		System.out.println(total);

		letters.delete(2, 8);
		System.out.println(letters);

		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8);
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);

		int[][] scores3 = new int[5][3];
		int[][] scores4 = new int[5][3];

		ArrayList<String> scores = new ArrayList<String>();
		ArrayList<String> scores2 = new ArrayList<String>();

		int[] random = { 6, -4, 12, 0, -10 };
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);

		List<Integer> list = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list);
		Integer array[] = list.toArray(new Integer[4]);
		System.out.println(array[0]);

		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		// ["30", "3A", "8", "FF"].
		Collections.sort(hex);
		System.out.println();
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(z);
		// hex.forEach(System.out::println);

		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
			System.out.println("A");
		else if (one.equals(two))
			System.out.println("B");
		else
			System.out.println("C");

		String sr = "Hello";
		String srx = "Hello";
		String sgrx = new String("Hello");
		System.out.println("Date");

		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

		String a1 = new String("abc");
		String b = "ABC";
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a1);
		System.out.println("b=" + b);

		StringBuilder one1 = new StringBuilder();
		StringBuilder two1 = new StringBuilder();
		StringBuilder three = one1.append(true);
		System.out.println(one1 == two1); // false
		System.out.println(one1 == three); // true
		three.append("1ghjghj23");
		System.out.println("Test");
		System.out.println(three);
		// System.out.println(three);

		int name[] = new int[3]; // { 1, 2 };
		int name2[] = { 7, 2 };
		Arrays.sort(name2);
		System.out.println("-------------");
		System.out.println(Arrays.binarySearch(name2, 2));
		String string = "John";

		ArrayList<String> arrayList = new ArrayList<>();
		// arrayList.add(true);

		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add(string);

		String[] strings = arrayList2.toArray(new String[0]);

		System.out.println(name == name);
		arrayList2.add(0, "hawk");
		arrayList2.forEach(System.out::println);
		System.out.println(arrayList2.remove("hawk"));
		System.out.println("NEW stuff");

		List<Integer> list1 = (Arrays.asList(10, 4, -1, 5));
		Collections.sort(list1);
		Integer array1[] = list1.toArray(new Integer[4]);
		System.out.println(array1[0]);

		String[] names = { "Tom", "Dick", "Harry" };
		List<String> list11 = Arrays.asList(names);
		list11.set(0, "Sue");
		System.out.println(names[0]);
		System.out.println(list11.get(1));

		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");

		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);

		for (int age : ages)
			System.out.print(age);

	}

}
