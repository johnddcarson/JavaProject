package Chap5;

public class BabyLion extends Lion {

	String className = this.getClass().getSimpleName();

	public BabyLion() {
		super(2);

	}

	public BabyLion(int age, boolean isLionMane, int tailLength) {
		super(age, isLionMane, tailLength);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void info() {
		// printLines();

		System.out.print(className);
		super.info();
	}

	@Override
	public int getlegs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void setTailLength(int tailLength) {
		// TODO Auto-generated method stub
		super.setTailLength(tailLength);
	}

	@Override
	public void printLines() {

		System.out.println("-".repeat(100));
	}

	@Override
	public void doSomthing() {
		// TODO Auto-generated method stub
		System.out.println(
				className + " I'm doing somthing. THis baby lion can jump " + Mammal3.getJumpHeight() + " CM.");
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		super.eatPlants();
	}

	@Override
	public void eatPlantsDefault() {
		System.out.println(className + " eat Plants Default method");

	}

}
