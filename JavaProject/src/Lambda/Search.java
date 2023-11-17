package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Search {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		Search a = new Search();

		print((animals), a -> a.canHop());
		System.out.println(moreG(true, true, true));

	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");

		}
		System.out.println();
	}

	public static int moreG(boolean b, boolean... b2) {
		return b2.length;
	}

}
