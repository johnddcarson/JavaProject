package Abstraction;

public class Dog extends Animal {

	private boolean isLikeCats;

	public Dog(String nameString, Integer anmialAge, Boolean isLikeCats) {
		super(nameString, anmialAge);
		this.isLikeCats = isLikeCats;

	}

	@Override
	public void move() {
		System.out.println("The " + getClass().getName() + " " + getNameString()
				+ " runs and barks while moving and it's age is " + anmialAge);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " does your dog like cats " + isLikeCats;
	}

}
