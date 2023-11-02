package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Alpha", "Bravo", "Tango", "Delta"));

		list.forEach(System.out::println);

		Calculator2(Integer::sum, 10, 5);

		Calculator2((s1, s2) -> s1 + s2, "Hello", "World");
		Calculator2(String::concat, "Hello", "World");

	}

	public static <T> T Calculator2(BinaryOperator<T> function, T value1, T value2) {

		T resulT = function.apply(value1, value2);
		System.out.println("Result of operation: " + resulT);
		return resulT;

	}

}
