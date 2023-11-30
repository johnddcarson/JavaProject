package A3;

public class Main {

	public static void main(String[] args) {

		Gorilla gorilla = new Gorilla(12);
		System.out.println(gorilla);

		Gorilla gorilla2 = new Gorilla("Small");

		System.out.println(gorilla2);

		// Animal animal = new Animal();

		// animal.print();
		gorilla.print();
		gorilla.Helper();
		gorilla.run5Km();
		gorilla.swim5Km();
		System.out.println(gorilla.getSpeed());
		CanRun.jump();

	}

}
