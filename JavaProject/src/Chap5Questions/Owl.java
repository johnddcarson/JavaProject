package Chap5Questions;

public class Owl extends Bird implements Nocturnal {

	@Override
	public boolean isBlind() {
		return false;
	}

	@Override
	public void fly() {
		System.out.println("Owl can fly");
	}

}
