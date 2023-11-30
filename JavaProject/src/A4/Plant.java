package A4;

abstract class Plant {

	protected void rev() throws Exception {

	}

	abstract void rotate();

}

class Earth extends Plant {

	@Override
	protected void rev() throws Exception {

		System.out.println("Hello");

	}

	@Override
	void rotate() {
		// TODO Auto-generated method stub

	}

}