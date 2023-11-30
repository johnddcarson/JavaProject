package A2;

public class Dog extends Pets {

	private String ballColour;

	public Dog() {
		super(generateRandomName(), r.nextInt(1, 10));
		this.ballColour = generateRandomColor();
	}

	public String getBallColour() {
		return ballColour;
	}

	public void setBallColour(String ballColour) {
		this.ballColour = ballColour;
	}

	@Override
	void petDetails() {
		System.out.println(String.format("The pet type is a %s. Name: %s, Age: %d. Ball colour is %s",
				getClass().getSimpleName(), getName(), getAge(), getBallColour()));
	}

	private static String generateRandomColor() {
		int randomColour = r.nextInt(5);

		switch (randomColour) {
		case 0:
			return "Red";
		case 1:
			return "Blue";
		case 2:
			return "Pink";
		case 3:
			return "Brown";
		case 4:
			return "Green";
		default:
			return "Orange";
		}

	}

	private static String generateRandomName() {
		int randomName = r.nextInt(5);
		switch (randomName) {
		case 0:
			return "Isla";
		case 1:
			return "Cooper";
		case 2:
			return "Brea";
		case 3:
			return "Skye";
		case 4:
			return "Quince";
		default:
			return "Bramble";

		}
	}

}
