package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<String> bingoPool = new ArrayList<>(75);

		int start = 1;

		for (char c : "BINGO".toCharArray()) {
			for (int i = start; i < (start + 15); i++) {
				bingoPool.add("" + c + i);
				// System.out.println("" + c + i);
			}
			start += 15;
		}

		Collections.shuffle(bingoPool);

		List<String> firstOnes = bingoPool.subList(0, 15);

		// firstOnes.forEach(System.out::println);

		System.out.println("-".repeat(30));
		firstOnes.sort(Comparator.naturalOrder());
		// firstOnes.forEach(System.out::println);
		// firstOnes.forEach(System.out::println);

		var tempStream = bingoPool.stream().limit(15).filter(s -> s.indexOf('B') == 0 || s.indexOf('O') == 0)
				.map(x -> x.charAt(0) + "-" + x.substring(1)).sorted();// ;.forEach(d -> System.out.print(d + " "));

		// tempStream.forEach(d -> System.out.print(d + " "));
		tempStream.forEach(d -> System.out.println(d.toLowerCase() + " "));

		String[] strings = { "One", "Two", "Three" };

		Arrays.stream(strings).sorted(Comparator.naturalOrder()).forEach(System.out::println);

		List<String> names = Arrays.asList("Alice  ", "Bob", "Charlie", "David", "David");

		names.stream().map(String::trim).map(String::toUpperCase).distinct().forEach(System.out::println);

		Random random = new Random();

		Stream.generate(() -> random.nextInt(10)).limit(100).forEach(System.out::print);

		System.out.println();

		IntStream.iterate(1, n -> n * 10).limit(10).forEach(x -> System.out.print(x + " "));

	}
}