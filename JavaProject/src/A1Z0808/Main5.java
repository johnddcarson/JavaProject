package A1Z0808;

public class Main5 {

	public static void main(String[] args) {

		nap(10, 20, 100, 65);
	}

	public static void nap(int... howLong) {
		System.out.println(howLong);
		for (int i : howLong) {
			System.out.println(i);
		}
		int j = howLong.length - 1;
		System.out.println("Print the first " + howLong[0]);
		System.out.println("Print the last " + howLong[j]);
	}

}
