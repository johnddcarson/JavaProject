package A1Z0808;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public void method2(ArrayList list) {
		if (list.isEmpty()) {
			System.out.println("e"); // If the ArrayList is empty, print "e"
		} else {
			System.out.println("n"); // If the ArrayList is not empty, print "n"
		}
	}

	String name;
	private Boolean empty;
	short numPets = 5;

	int number;

	public Main() {
		this.name = "JohnD";
	}

	public String getname() {

		return name;

	}

	public static void main(String[] args) {
		{
			System.out.println("Welcome to my Java programme");
		}
		var random = new Random();

		System.out.println(random.nextInt(100));

		m1();

		Main main = new Main();

		System.out.println(main.getname());

		main.m1();
		main.m2();

		main = null;

		ArrayList<String> list = new ArrayList<>(Arrays.asList("John"));

		list.add("Carson");

		//main.method2(list);

		list.forEach(System.out::println);

		LocalDate today1 = LocalDate.now();

		System.out.println(today1);
		Integer maxint = Integer.MAX_VALUE;
		int maxint2 = Integer.MAX_VALUE;
		String formatted = String.format("%,d", maxint);
		System.out.println(formatted);

		String $hi = "Today";
		String A$B, s2;
		boolean b1, b2;
		String s10 = "1", s20;
		double d1;
		double d2;
		int i1;
		int i2;
		int i3, i4;
		s2 = "s2";
		System.out.println($hi.toUpperCase());
		System.out.println(maxint.toString());

		double ig1 = 0xe;

		System.out.println(ig1);
		// double d1 = 1_234_.0;
		// double d2 = 1_234._0;
		// double d3 = 1_234.0_;
		double d4 = 1_234.0;

		System.gc();

	}

	public static void m1() {
		int £6 = 100;

		System.out.println("Hello 1 " + " " + £6);

	}

	public void m2() {

		System.out.println("Hello 2");

	}

	public void read(Files files) {
		Paths.get("name");
	}

	public void method(ArrayList list) {
		if (list.isEmpty()) {
			System.out.println("e");
		} else {
			System.out.println("n");
		}
	}

	public void eatMore(boolean hungry) {
		int roomInBelly = 5;
		if (hungry) {
			boolean timeToEat = true;
			int amountOfFood = 0;
			while (amountOfFood > 0) {
				int amountEaten = 2;

				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
			}
		}
		// System.out.println(amountOfFood);
	}

}
