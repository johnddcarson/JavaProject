package pond.duck;

public class GoodDuckling {

	public static void main(String[] args) {

		GoodDuckling duckling = new GoodDuckling();

		duckling.makeNoise();

	}

	public void makeNoise() {
		MotherDuck duck = new MotherDuck();
		duck.quack(); // default access
		System.out.println(duck.noise); // default access
	}

}
