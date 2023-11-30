package A1Z0808;

public class TesMain {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		StringBuilder sb2 = new StringBuilder("animals");
		String abc = "animals";
		String anotherFish = abc + 1;
		String s = "Hello";
		String t = new String(s);

		if ("Hello".equals(s))
			System.out.println("one");
		if (t == s)
			System.out.println("two");
		if (t.equals(s))
			System.out.println("three");

		if ("Hello" == s)
			System.out.println("four");

		if ("Hello" == t)
			System.out.println("five");
		/*
		 * System.out.println(sb.equals(sb2)); // System.out.println(abc.equals(abc2));
		 * System.out.println(sb == sb2); // System.out.println(abc == abc2);
		 * 
		 * int[] objects = new int[] { 1, 2 }; int[] objects2 = { 1, 2, 3 }; objects[0]
		 * = 1;
		 * 
		 * System.out.println(anotherFish);
		 */

	}
}