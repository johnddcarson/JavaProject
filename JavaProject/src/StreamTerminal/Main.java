package StreamTerminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbersIntegers = IntStream.iterate(0, i -> i <= 100, i -> i = i + 1).filter(i -> i % 3 == 0)
				.boxed().collect(Collectors.toList());

		Collections.reverse(numbersIntegers);
		Collections.shuffle(numbersIntegers);

		numbersIntegers.forEach(System.out::print);
		System.out.println();

		var numberInteger = IntStream.iterate(0, i -> i <= 100, i -> i = i + 1).filter(i -> i % 2 == 0).boxed()
				.toArray();

		for (var number : numberInteger) {
			System.out.print(number + " ");
		}

		// numberInteger.forEach(System.out::print);
		System.out.println();

		var result2 = IntStream.iterate(0, i -> i <= 100, i -> i = i + 1).filter(i -> i % 3 == 0).filter(s -> s > 89)
				.mapToObj(i -> "Number = " + i + "! ");
		// System.out.println(result2);
		result2.forEach(System.out::print);

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		Collections.reverse(numbers);

		System.out.println(numbers);
		numbers.forEach(System.out::println);
	}

}
