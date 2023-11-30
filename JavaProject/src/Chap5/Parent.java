package Chap5;

abstract class Parent {

	public static void print() {
		System.out.println("Hello");

	}

	abstract void mustbeUsed();

	public void fly() {
		System.out.println("Bird is flying");

	}

	public void eat(int food) {
		System.out.println("Bird is eating " + food + " units of food");
	}
}