package A2;

import java.util.Random;

public class Cat extends Pets {

	private boolean bell;

	protected Cat() {
		super(generateRandomName(), r.nextInt(11, 20));
		this.bell = new Random().nextBoolean();
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	@Override
	void petDetails() {
		System.out.println(String.format("The pet type is a %s. Name: %s, Age: %d. Has Bell? %b",
				getClass().getSimpleName(), getName(), getAge(), isBell()));
	}

	private static String generateRandomName() {
		int randomName = r.nextInt(5);
		switch (randomName) {
		case 0:
			return "Buddy";
		case 1:
			return "Whiskers";
		case 2:
			return "Fluffy";
		case 3:
			return "Max";
		case 4:
			return "Mittens";
		default:
			return "Charlie";

		}
	}

}
