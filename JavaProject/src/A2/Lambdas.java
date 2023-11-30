package A2;

import static A2.Pets.askUserHowManyPetObjectsToCreate;

@FunctionalInterface
interface Adder {
	int add(int a, int b);
}

public class Lambdas {

	public static void main(String[] args) {

		askUserHowManyPetObjectsToCreate();

		Adder adder = (a, b) -> a + b;
		int result = adder.add(5, 10);
		System.out.println("Result: " + result);
	}

}
