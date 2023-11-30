package Chap5Questions;

public abstract class Bird {
	public void fly() {
		System.out.println("Bird is flying");
	}

	public static void main(String[] args) {

		Bird bird = new Owl();
		bird.fly();
	}

}
