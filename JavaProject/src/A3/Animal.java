package A3;

abstract class Animal implements CanSwim, CanRun {

	int age;

	public Animal(int age) {
		super();
		this.age = age;
	}

	public Animal() {
	}

	protected void print() {
		System.out.println("Print parent");
	}

	protected abstract void Helper();

	public void run5Km() {
		System.out.println("YES Run");

	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return CanSwim.super.getSpeed();
	}

}