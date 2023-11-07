package Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {

		Caller c = new Caller();

		c.start();

		IntStream.iterate((int) 'A', i -> i <= (int) 'Z', i -> i + 1).filter(Character::isAlphabetic)
				.map(Character::toLowerCase).dropWhile(i -> Character.toUpperCase(i) <= 'J').sorted()
				.forEach(d -> System.out.printf("%c ", d));

		System.out.println();

		int maxSeats = 100;
		int seatsInRow = 10;

		var stream = Stream.iterate(0, i -> i < maxSeats, i -> i + 1)
				.map(i -> new Seat((char) ('A' + i / seatsInRow), i % seatsInRow + 1)).map(Seat::toString).limit(10)
				.peek(System.out::println);

		stream.forEach(System.out::println);

	}

}
