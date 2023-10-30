package LambdaExpression;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainChallenge {

	public static void main(String[] args) {

		Consumer<String> printTheParts = new Consumer<>() {

			@Override
			public void accept(String sentence) {
				String[] partStrings = sentence.split(" ");

				for (String part : partStrings) {
					System.out.println(part);

				}

			}
		};

		printTheParts.accept("Hello world");

		Consumer<String> printThePartLambda = sentence -> {
			String[] partStrings = sentence.split(" ");
			Arrays.asList(partStrings).forEach(System.out::println);

		};

		printThePartLambda.accept("Hello world");

		System.out.println(everySecondChar("12345678"));

		UnaryOperator<String> x = source -> {

			StringBuilder returnValBuilder = new StringBuilder();
			for (int i = 0; i < source.length(); i++) {
				if (i % 2 == 1) {
					returnValBuilder.append(source.charAt(i));

				}
			}
			return returnValBuilder.toString();

		};

		System.out.println(x.apply("12345678"));

		// Declare a Supplier using a lambda expression
		Supplier<String> supplier = () -> "I love Java.";

		// Use the Supplier to get a result
		String result = supplier.get().replace(" ", "").toLowerCase();

		// Print the result
		System.out.println(result);

	}

	public static String everySecondChar(String source) {

		StringBuilder returnValBuilder = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			if (i % 2 == 1) {
				returnValBuilder.append(source.charAt(i));

			}
		}
		return returnValBuilder.toString();
	}

}
