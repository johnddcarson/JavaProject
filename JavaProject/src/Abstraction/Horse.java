package Abstraction;

public class Horse extends Mammal {

	public Horse(String nameString, Integer anmialAge, Boolean isMammalBoolean) {
		super(nameString, anmialAge, isMammalBoolean);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shedHair() {
		System.out.println("Horses shed hair all year round");

	}

}
