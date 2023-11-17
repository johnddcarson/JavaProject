package A1Z0808;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salmon<E> {

	int count;

	public void Salmon() {
		count = 4;
	}

	public static void main(String[] args) {
		Salmon s = new Salmon();
		System.out.println(s.count);

		// double x = 39.21;
		// double y = 2;
		// boolean b = true;
		// y = -y;
		// b = !b;
		// System.out.println(b);
		// System.out.println(y);
		int counter = 0;
		System.out.println(counter); // Outputs 0
		System.out.println(++counter);
		System.out.println(counter);

		// int x = 10, y = 20, z = 10;

		// if (y == 20 | x == 10 | z == 10) {
		// System.out.println("Worked");

		/*
		 * boolean y = false; boolean x = (y = true); System.out.println(x); // Outputs
		 * true int hourOfDay = 5; int morningGreetingCount = 0; if (hourOfDay < 11)
		 * morningGreetingCount++ System.out.println("Good Morning");
		 * 
		 * System.out.println(morningGreetingCount);
		 * 
		 * 
		 * //int y = 10; //int x = (y > 5) ? (2 * y) : (3 * y);
		 * 
		 * System.out.println(x);
		 * 
		 * boolean bWhile = false; List<String> names = new
		 * ArrayList<>(Arrays.asList("John", "Heather", "Katrina", "Kevin")); int count
		 * = 0; Collections.shuffle(names);
		 * 
		 * while (!bWhile) {
		 * 
		 * String searchName = names.get(count);
		 * 
		 * if (searchName.equalsIgnoreCase("john")) { bWhile = true;
		 * System.out.println(searchName + " Founds!" + " Count = " + count);
		 * 
		 * } count++;
		 * 
		 * if (count == names.size()) { System.out.println("Not found"); break; }
		 */
		final char a = 'A', d = 'D';
		char grade = 'B';

		switch (grade) {
		case a:
		case 'B':
			System.out.print("great");
		case 'C':
			System.out.print("good");
			break;
		case d:
		case 'F':
			System.out.print("not good");
		}
		// int x = 5;
		// System.out.println((x > 2) ? ((x < 4) ? 10 : 8) : 7);
		System.out.println();
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z = false);
		System.out.println(x + ", " + y + ", " + z);

		for (int i = 0; i < 1;) {
			i++;
			System.out.println("Hello World");
		}

		int c = 7;
		int result = 4;

		result += c;
		System.out.println(result);
		System.out.println(result);

		// String p = 5;
		// byte l = 5;

		// float rr = 2 + p;

		// System.out.println("Test " + rr);

		int x1 = 50, x2 = 75;
		boolean b = x1 >= x2;
		if (b = true)
			System.out.println("Success");
		else
			System.out.println("Failure");

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);

		String s1 = "\tLondonderry\n    ";

		System.out.println(s1);
		System.out.println(s1.trim());
		String s2 = s1.concat("2");
		s2.concat("3");
		s2 = s1.replaceAll("London", "");
		System.out.println(s2.replace('d', 'D'));

		String result1 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result1);

		String a1 = "abc";
		String b1 = a1.toUpperCase(); // b1 = ABC
		b1 = b1.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a1);
		System.out.println("b=" + b1);

		StringBuilder alpha = new StringBuilder();
		for (char current = 'a'; current <= 'z'; current++)
			alpha.append(current);
		System.out.println(alpha);

		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle"); // sb = "start+middle"
		StringBuilder same = sb.append("+end");

		StringBuilder a11 = new StringBuilder("abc");
		StringBuilder b11 = new StringBuilder(a11.append("de")); // abcde
		b11 = b11.append("f").append("g");//
		a11.append("X");
		System.out.println("a=" + a11);// abcde
		System.out.println("b=" + b11);// abcdefg

		StringBuilder sb1 = new StringBuilder("animals");
		String sub = sb1.substring(sb1.indexOf("a"), sb1.indexOf("al"));
		System.out.println(sub);
		int len = sb1.length();
		System.out.println(len);// 7
		char ch = sb1.charAt(6);
		System.out.println(ch);// s

		System.out.println(sub + " " + len + " " + ch);

		StringBuilder sb11 = new StringBuilder().append(1).append('c');
		sb11.append("-").append(true);
		System.out.println(sb11);

		sb11.deleteCharAt(0);
		sb11.reverse();
		System.out.println(sb11);

		int sde2 = 1;

		StringBuilder one = new StringBuilder("john");
		StringBuilder two = new StringBuilder("john");
		// StringBuilder three1 = one.append("a");
		System.out.println();
		System.out.println(one.toString().equals(two.toString()));

		String x11 = "Hello World";
		String y1 = "Hello World";
		System.out.println(x11 == y1); // true

		String x111 = "Hello World";
		String z1 = " Hello World".trim();
		System.out.println(x111 == y1); // false
		System.out.println();
		Salmon t1 = new Salmon();
		Salmon t2 = new Salmon();
		Salmon t3 = t1;
		System.out.println(t1 == t1); // true
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t3)); // false

		String[] johnArray = new String[5];

		for (Integer i = 0; i < johnArray.length; i++) {
			String add = i.toString();
			johnArray[i] = i.toString();

			System.out.println(johnArray[i]);

		}
		Arrays.sort(johnArray);

		System.out.println("Test " + Arrays.binarySearch(johnArray, "5hh"));

		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(Arrays.toString(bugs)); // [Ljava.lang.String;@

		// Object[] namessStrings = { "cricket", "beetle", "ladybug" };

		// System.out.println(Arrays.toString(namessStrings));

		String[] strings = { "stringValue" };
		System.out.println(strings[0]);

		String[][] rectangle = new String[3][2];
		System.out.println(rectangle.length);

		// rectangle[0][1] = "set";

		// Arrays.fill(rectangle, "John");
		int[][] differentSize = { { 1, 4 }, { 3 }, { 9, 8, 7 } };
		int[][] args1 = new int[4][];
		args1[0] = new int[5];
		args1[1] = new int[3];
		System.out.println(rectangle.length);

		ArrayList<String> list5 = new ArrayList<>();

		list5.add("John");

		System.out.println(list5.toString());

		ArrayList list = new ArrayList();
		list.add("hawk"); // [hawk]
		list.remove("hawk");

		// List<Int> one1 = new ArrayList<>();
		List<String> two1 = new ArrayList<>();
		int sdjsds = two1.size();

		// System.out.println(one1.equals(two1)); // true
		// one1.add("a"); // [a]

		String[] array = { "hawk", "robin" }; // [hawk, robin]

		int sdsds = array.length;
		List<String> list1 = Arrays.asList(array); // returns fixed size list
		System.out.println(list1.size()); // 2
		list1.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b111 : array)
			System.out.println(b111 + " "); // new test
		// list1.remove(1); // throws UnsupportedOperation Exception

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);

		// LocalTime localTime = LocalTime.;

		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println("Test " + date);
		date = date.plusDays(2);
		System.out.println("Test " + date);
		Period everyOtherDay = Period.ofDays(2);
		Period wrong = Period.ofWeeks(1);
		date = date.plus(everyOtherDay);

		LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.now());

		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM

		StringBuilder sb111 = new StringBuilder();

		sb111.append("aaa").insert(1, "bb").insert(4, "ccc");

		System.out.println(sb111);

		String sx1 = "java";
		StringBuilder sx2 = new StringBuilder("java");
		sx1.concat("!!!");
		sx2.append("!!!");

		System.out.println(sx1);
		System.out.println(sx2);

		String letters = "";
		letters += 'c';
		System.out.println(letters);
		int len1 = 0;
		String numbers = "012345678";
		System.out.println(len1 += numbers.substring(1, 2).length());
		System.out.println(len1 += numbers.substring(2, 2).length());
		System.out.println(len1 += numbers.substring(6, 3).length());

		String s11 = "purr";
		s11.toUpperCase();
		s11.trim();
		s11.substring(1, 3);

		s11 += " two";
		System.out.println(s11.length());

	}
}