package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Alpha", "Bravo", "Tango", "Delta"));

		for (var s : list) {
			System.out.println(s);
		}

		printDash();
		list.forEach(s -> System.out.println("Code: " + s));
		printDash();
		list.forEach(System.out::println);
		list.removeIf(s -> s.equalsIgnoreCase("Bravo"));
		list.addAll(List.of("Echo", "Nuts", "Isla"));
		list.forEach(System.out::println);
		printDash();
		list.sort(Comparator.naturalOrder());
		printDash();
		list.removeIf(s -> s.contentEquals("Alpha"));

		printDash();
		list.forEach((var myString) -> System.out.println(myString));

		printDash();
		String prefix = "nato";
		list.forEach((var myString) -> {
			char first = myString.charAt(0);
			System.out.println(prefix + " " + myString + " means " + first);
		});
		printDash();
		Calculator((a, b) -> a * b, 5, 2);
		printDash();

		Calculator((a, b) -> a.toUpperCase() + " " + b.toLowerCase(), "Hello", "John");
		printDash();

		printDash();
		Calculator2((a, b) -> a * b, 5, 2);

		Calculator2((a, b) -> a.toUpperCase() + " " + b.toLowerCase(), "Hello", "John");
		printDash();

		var coords = Arrays.asList(new double[] { 47.50, -95.23 }, new double[] { 57.50, -85.23 },
				new double[] { 17.50, -65.23 });

		// coords.forEach(x -> System.out.println(Arrays.toString(x)));

		BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.println("Lat: " + lat + " Long: " + lng);

		var firstPoint = coords.get(0);

		processPoint(firstPoint[0], firstPoint[1], p1);
		printDash();
		processPoint(firstPoint[0], firstPoint[1], (lat, lng) -> System.out.println("Lat: " + lat + " Long: " + lng));

		String test = "Hello";

		boolean result = test.equalsIgnoreCase("Hello");
		System.out.println(result);
		printDash();

		list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
		list.forEach(System.out::println);
		printDash();

		String[] emptyStrings = new String[10];
		System.out.println(Arrays.toString(emptyStrings));
		Arrays.fill(emptyStrings, "");
		System.out.println(Arrays.toString(emptyStrings));

		Arrays.setAll(emptyStrings, i -> "John" + (i + 1));
		System.out.println(Arrays.toString(emptyStrings));

		String[] name = { "Alice", "Bob", "Charlie", "David", "Eve" };
		String[] randomList = randonValue(2, name, () -> new Random().nextInt(0, name.length));
		System.out.println(Arrays.toString(randomList));

	}

	public static void printDash() {
		System.out.println("-".repeat(30));
	}

	public static <T> T Calculator(Opseration<T> function, T value1, T value2) {

		T resulT = function.operate(value1, value2);
		System.out.println("Result of operation: " + resulT);
		return resulT;

	}

	public static <T> T Calculator2(BinaryOperator<T> function, T value1, T value2) {

		T resulT = function.apply(value1, value2);
		System.out.println("Result of operation: " + resulT);
		return resulT;

	}

	public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumerz) {

		consumerz.accept(t1, t2);

	}

	public static String[] randonValue(int count, String[] values, Supplier<Integer> s) {

		String[] selectedValue = new String[count];
		for (int i = 0; i < count; i++) {
			selectedValue[i] = values[s.get()];
		}
		return selectedValue;
	}

}
