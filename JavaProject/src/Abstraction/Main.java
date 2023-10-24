package Abstraction;

public class Main {

	public static void main(String[] args) {
		Dog islaDog = new Dog("Isla", 3, false);

		System.out.println(islaDog);
		islaDog.move();

		Cat beanCat = new Cat("Beans", 1, true);
		beanCat.move();
		System.out.println(beanCat);

	}

}
