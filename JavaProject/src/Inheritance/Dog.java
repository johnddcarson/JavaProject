package Inheritance;

public class Dog extends Animal {

	private String earShape;
	private String tailShape;

	public Dog(String type, String size, double weight, String earShape, String tailShape) {
		super(type, size, weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public void makeNoise() {
		System.out.println("The type of anmial is " + type + " and they make a barking noise");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		System.out.println("Dogs walk, run and wag their tail");
		bark();
		if (speed.equalsIgnoreCase("Slow")) {
			walk();
		} else {
			run();
		}
	}

	public void bark() {
		System.out.println("A dog Woofs");
	}

	public void run() {
		System.out.println("A dog runs");
	}

	public void walk() {
		System.out.println("A dog walks");
	}

	public void wagTail() {
		System.out.println("Tail wagging");
	}

	@Override
	public String toString() {
		return super.toString() + "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=";

	}

}
