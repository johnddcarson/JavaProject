package Chap5;

public class Kangaroo extends Marsupial {

	protected int tailLength = 8;

	public boolean isBiped() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped() + " Tail: " + tailLength);
	}

	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}

}
