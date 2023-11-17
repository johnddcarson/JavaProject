package Chap5;

public abstract class Animal extends java.lang.Object implements MammalTwo, Mammal3 {

	protected int age;

	public Animal(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	protected abstract void info();

	public abstract void printLines();

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 99;
	}

}
