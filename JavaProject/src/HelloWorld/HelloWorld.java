package HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World, John this is the start of somthing new");

		boolean isAlien = true;
		System.out.println("Adding a this in ");
		if (isAlien) {
			System.out.println("It is not an Alien!!");
		} else {
			System.out.println("It is an Alien!!");
		}

		int topScore = 100;

		if (topScore == 100) {
			System.out.println("You got the high score");
		} else {
			System.out.println("You will need to try again to get the high score");
		}

		int newValue = 50;
		if (newValue == 50) {
			System.out.println("This is true");
		}

		boolean isCar = false;
		if (!isCar) {
			System.out.println("This is not supposed to happen");
		}
		String makeOfCar = "VW";
		boolean isDomestic = (makeOfCar == "VW") ? true : false;

		System.out.println("Is the car VW" + " " + isDomestic);

	}

}
