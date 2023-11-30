package A2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Pets {

	private String name;
	private int age;
	protected static Random r = new Random();

	protected Pets(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	abstract void petDetails();

	private static void displayPetdetails(List<Pets> pets) {

		Collections.sort(pets, Comparator.comparingInt(pet -> pet.getAge()));

		for (var pet : pets) {
			Printable printable = (a) -> a.petDetails();
			printable.print(pet);
		}
	}

	private static List<Pets> createPets(int numberOfDogs, int numberOfCats) {

		List<Pets> pets = new ArrayList<>();

		for (int i = 0; i < numberOfDogs; i++) {
			Dog newDog = new Dog();
			pets.add(newDog);

		}
		for (int i = 0; i < numberOfCats; i++) {
			Cat newCat = new Cat();
			pets.add(newCat);

		}

		return pets;

	}

	protected static void askUserHowManyPetObjectsToCreate() {

		Scanner sc = new Scanner(System.in);
		int numberOfDogs = 0;
		int numberOfCats = 0;
		while (true) {
			try {
				System.out.println("How many Dogs do you want to print?");
				numberOfDogs = sc.nextInt();
				System.out.println("How many Cats do you want to print?");
				numberOfCats = sc.nextInt();
				break; // Break out of the loop if the input is valid
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer. " + e);
				sc.nextLine(); // Consume the invalid input

			}

		}

		displayPetdetails(Pets.createPets(numberOfDogs, numberOfCats));
		sc.close();
	}
}
