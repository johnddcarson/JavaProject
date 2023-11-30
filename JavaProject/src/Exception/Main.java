package Exception;

public class Main {

	public static void main(String[] args) throws Exception {
		int divide = 11 / 0;

		// System.out.println(Dog.exceptions());

		Dog dog = new Dog();
		try {
			int validLegs = dog.legs(4);
			System.out.println("Valid number of legs: " + validLegs);

			// Uncomment the line below to see the exception handling
			// int invalidLegs = dog.legs(6);
			// System.out.println("Valid number of legs: " + invalidLegs);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		// int invalidLegs = dog.legs(6);

		String s = "";
		try {
			// s = "t";
		} catch (Exception e) {
			s += "c";
		} finally {
			s += "f";
		}
		s += "a";
		s.length();
		// System.out.print(s);

		// Create an instance of AnimalsOutForAWalk
		AnimalsOutForAWalk animalsOutForAWalk = new AnimalsOutForAWalk();
		// dog.arrayMethod(19);
		try {
			// Call the arrayMethod with a valid index
			// dog.arrayMethod(5);

			// Call the arrayMethod with an invalid index
			dog.arrayMethod(5);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
			System.out.println("Does it get part 2!!!");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException " + e.getMessage());
		} finally {
			System.out.println("Finaly runs");
		}

		System.out.println("Can this code be ran");
		Dog dog2 = new Dog();

		System.out.println("This code can run and the dog has 4 legs " + dog2.legs(4));

	}

}
