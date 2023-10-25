package Abstraction;

abstract class Mammal extends Animal {

	Boolean isMammalBoolean;

	public Mammal(String nameString, Integer anmialAge, Boolean isMammalBoolean) {
		super(nameString, anmialAge);
		this.isMammalBoolean = isMammalBoolean;

	}

	public void move() {
		System.out.println(getExplicitType());
		System.out.println("This horse runs really fast");

	}

	public abstract void shedHair();

}

public abstract class Animal {

	private String nameString;

	protected Integer anmialAge;

	public Animal(String nameString, Integer anmialAge) {
		this.nameString = nameString;
		this.anmialAge = anmialAge;
	}

	public abstract void move();

	public String getNameString() {
		return nameString;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [nameString=" + nameString + ", anmialAge=" + anmialAge + "]";
	}

	public String getExplicitType() {

		return getClass().getSimpleName();

	}

}
