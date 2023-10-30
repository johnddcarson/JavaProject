package LambdaExpressionChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

	private static Random random = new Random();

	public static void main(String[] args) {

		String[] firstNames = { "Alice", "Bob", "Charlie", "David", "Eve" };

		System.out.println(Arrays.toString(firstNames));

		Arrays.setAll(firstNames, i -> firstNames[i].toUpperCase());

		System.out.println(Arrays.toString(firstNames));

		List<String> backedByArrayList = Arrays.asList(firstNames);

		backedByArrayList.forEach(System.out::println);
	}

}
