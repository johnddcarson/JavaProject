package Chap5;

public class Marsupial {

	protected int tailLength = 4;

	public boolean isBiped() {
		return false;
	}

	public final void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped() + " Tail: " + tailLength);
	}

}
