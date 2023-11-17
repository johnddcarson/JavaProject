package pond.duck;

public class FatherDuck {

	protected String noise = "quack";

	protected void quack() {
		System.out.println(noise); // private access is ok
	}

	private void makeNoise() {
		quack(); // private access is ok
	}
}
