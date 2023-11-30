package Chap5;

public class Mainp {

	public static void main(String[] args) {
		Child child = new Child();
		// Parent parent = new Parent();
		System.out.println("TEST");

		child.eat(10);
		child.mustbeUsed();
		child.alchemy();
		Parent3.jump();

		Parent parent2 = child;

	}

}
