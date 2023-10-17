package Inheritance;

public class Main extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Generic Animal", "Huge", 400);
		doAnimialStuff(animal, "slow");

		Dog dog1 = new Dog("Dog", "Medium", 10, "Pointy", "Long");
		doAnimialStuff(dog1, "fast");

		Dog dog2 = new Dog("Dog", "Medium", 80, "Pointy", "Long");
		doAnimialStuff(dog2, "fast");

		Fish fish = new Fish("Gold Fish", 0.23, 2, 3);
		doAnimialStuff(fish, "Fast");

		System.out.println(fish.equals(fish));

	}

	public static void doAnimialStuff(Animal animal, String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("---------------");

	}

}
