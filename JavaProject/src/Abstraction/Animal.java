package Abstraction;

abstract class Animal {

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

}
