package Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Collection<String> list = new HashSet<>();

		String[] nameStrings = { "John", "Heather", "Katrina", "Jane" };

		list.addAll(Arrays.asList(nameStrings));

		System.out.println(list);
		printDash();
		list.forEach(System.out::println);

		list.add("Fred");

		System.out.println("John in the list " + list.contains("John"));

		list.removeIf(s -> s.charAt(0) == 'J');

		printDash();
		System.out.println(list);
		System.out.println("John in the list " + list.contains("John"));

		System.out.println(list.size());

		char abbrev = 'G';
		int charIndex = "JQKA".indexOf(abbrev);
		System.out.println(charIndex);

	}

	public static void printDash() {

		System.out.println("-".repeat(30));

	}

}
