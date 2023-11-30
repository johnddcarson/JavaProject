package Chap5Questions;

public class Mammal {
	public Mammal(int age) {
		System.out.print("Mammal");
	}
}

class Platypus extends Mammal {
	public Platypus() {
		super(10);
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5);
	}
}