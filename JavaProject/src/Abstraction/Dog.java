package Abstraction;

public class Dog extends Animal {

	private boolean isLikeCats;
	private String typeString;

	public Dog(String nameString, Integer anmialAge, boolean isLikeCats, String typeString) {
		super(nameString, anmialAge);
		this.isLikeCats = isLikeCats;
		this.typeString = typeString;
	}

	@Override
	public void move() {
		System.out.println("The " + getExplicitType() + " " + getNameString()
				+ " runs and barks while moving and it's age is " + anmialAge);

	}

	@Override
	public String getExplicitType() {
		// TODO Auto-generated method stub
		return super.getExplicitType() + " (Woof)";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " does your dog like cats " + isLikeCats + " is a  " + typeString;
	}

}
