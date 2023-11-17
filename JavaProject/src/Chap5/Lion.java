package Chap5;

public class Lion extends Animal {

	private boolean isLionMane;
	private int tailLength;

	public Lion(int age) {
		super(age);

	}

	public Lion(int age, boolean isLionMane) {
		this(age);
		this.isLionMane = isLionMane;
	}

	public Lion(int age, boolean isLionMane, int tailLength) {
		this(age, isLionMane);
		this.tailLength = tailLength;
	}

	@Override
	public int getAge() {
		return super.getAge() + 10;
	}

	public int getTailLength() {
		return tailLength;
	}

	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}

	public boolean isLionMane() {
		return isLionMane;
	}

	public void setLionMane(boolean isLionMane) {
		this.isLionMane = isLionMane;
	}

	protected void roar() {

		System.out.println("The " + super.getAge() + " " + "year old lion says: Roar!" + "\nDoes the lion have a mane: "
				+ this.isLionMane() + " " + myName + " " + getSpeed() + " Height jumped: " + Mammal.getJumpHeight());

	}

	@Override
	protected void info() {
		System.out.println("Animal [age=" + getAge() + "]" + " " + "Lion [isLionMane=" + isLionMane + ", tailLength="
				+ tailLength);
		printLines();

	}

	@Override
	public void printLines() {

		System.out.println("*".repeat(100));
	}

	@Override
	public void doSomthing() {
		System.out.println("I'm doing somthing");

	}

	@Override
	public int getlegs() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void eatPlants() {
		System.out.println("Tasty Plants");

	}

	@Override
	public int eatPlants(int quantity) {
		// TODO Auto-generated method stub
		return quantity + 10;
	}

	@Override
	public void drinkWater(int amount) {
		System.out.println("INT");

	}

	@Override
	public void drinkWater(double amount) {
		System.out.println("DOUBLE");

	}

}
