package A3;

public class Primate {

	public int length = 0;
	{
		length = 2;
	}

	public boolean hasHair() {
		return true;
	}

	public Primate() {
		this(2);
		System.out.println(hasHair());
	}

	public Primate(int i) {
		// TODO Auto-generated constructor stub
	}

	public int howMany(boolean b, boolean... b2) {
		return b2.length;

	}

	public void printName(double input) {
		System.out.print("Arthropod");

	}

	interface HasTail {
		int amount = 10;

		boolean isTailStriped();
	}

	class Lemur extends Primate implements HasTail {

		public int age = 10;

		public boolean isTailStriped() {
			return false;
		}

		public void printName(int input) {
			System.out.print("Spider");
		}
	}

}
