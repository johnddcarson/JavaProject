package Abstraction;

public class Cat extends Animal {

	private Boolean isCatAllowedOutsideBoolean;

	public Cat(String nameString, Integer anmialAge, Boolean isCatAllowedOutsideBoolean) {
		super(nameString, anmialAge);
		this.isCatAllowedOutsideBoolean = isCatAllowedOutsideBoolean;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("The " + getClass().getName() + " " + getNameString()
				+ " meows, chirrups, hisses, while moving and it's age is " + anmialAge);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " is " + getNameString() + " allowed outside "
				+ ((isCatAllowedOutsideBoolean) ? "Yes" : "No");
	}

}
