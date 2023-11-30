package Chap5Questions;

public class Main {

	public static void main(String[] args) {

		System.out.println("Print");

		Spider spider = new Spider();

		spider.printName(4);
		spider.printName(9.0);

		Nocturnal nocturnal = new Owl();

		Owl owl = new Owl();
		System.out.println();
		owl.fly();

		Bird bird = new Owl();

		System.out.println();

		System.out.println(nocturnal.isBlind());

	}
}
