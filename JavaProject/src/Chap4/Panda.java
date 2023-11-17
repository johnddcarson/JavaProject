package Chap4;

import java.util.function.Predicate;

public class Panda {

	private String name = "Torchie";
	{
		System.out.println(name);
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);
	}
	{
		COUNT++;
		System.out.println(COUNT);
	}

	public Panda() {
		System.out.println("constructor");
	}

	int age;

	public static void main(String[] args) {

		new Panda();
		System.out.println("read to construct");
		/*
		 * Panda p1 = new Panda(); new Panda(); p1.age = 1; check(p1, p -> p.age < 5);
		 * 
		 * int original1 = 1; int original2 = 2; int[] numbers = new int[2];
		 * 
		 * numbers = swap(original1, original2);
		 * 
		 * original1 = numbers[0]; original2 = numbers[1];
		 * 
		 * System.out.println(); System.out.println(original1); // 1
		 * System.out.println(original2); // 2
		 */
		/*
		 * // Examples of different types passed to the fly method p1.fly("String"); //
		 * String is an Object p1.fly(42); // Integer is an Object p1.fly(3.14); //
		 * Double is an Object p1.fly(true); // Boolean is an Object p1.fly(new
		 * Panda()); // Custom class instance is an Object p1.fly(new int[] { 1, 2, 3
		 * }); // Array is an Object p1.fly(null); // null is an Object
		 */
	}

	private static void check(Panda panda, Predicate<Panda> pred) {
		String result = pred.test(panda) ? "match" : "not match";
		System.out.print(result);
	}

	public static void walk1(int... nums) {

		System.out.println(" Hello number " + nums[0]);
		System.out.println("Hello number " + nums[1]);
	}

	public static int[] swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;

		int[] numbers = new int[2];

		numbers[0] = a;
		numbers[1] = b;

		return numbers;
	}

	public void fly(Object o) {
		System.out.println("object ");
	}

	public void fly(int o) {
		System.out.println("Integer ");
	}

}