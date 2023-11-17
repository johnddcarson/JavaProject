package pond.duck;

public class MotherDuck {

	public String noise = "quack";

	public void quack() {
		System.out.println(noise); // default access is ok
	}

	public void makeNoise() {
		quack();

	}

}