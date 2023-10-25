package Abstraction;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Dog islaDog = new Dog("Isla", 3, false, "Labrador");

		System.out.println(islaDog);
		islaDog.move();

		Cat beanCat = new Cat("Beans", 1, true);

		Horse horse = new Horse("Peanut", 25, true);

		beanCat.move();
		System.out.println(beanCat);

		System.out.println("-".repeat(30));

		doAnimalStuff(islaDog);

		ArrayList<Animal> animalsList = new ArrayList<Animal>();

		animalsList.add(beanCat);
		animalsList.add(islaDog);
		animalsList.add(new Dog("Paddy", 5, false, "Pug"));
		animalsList.add(new Horse("Peanut", 25, true));

		System.out.println(animalsList);

		for (Animal animal : animalsList) {
			doAnimalStuff(animal);
		}

		System.out.println(islaDog.getExplicitType());

		System.out.println("-".repeat(30));
		horse.move();
		horse.shedHair();
		System.out.println(horse);

	}

	public static void doAnimalStuff(Animal animal) {

		animal.move();
	}

}
