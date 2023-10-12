package Section_5;

public class MethodOverloadingChallenge {

	public static void main(String[] args) {

		System.out.println(convertToCentimeters(100));
		System.out.println(convertToCentimeters(5, 10));

	}

	public static double convertToCentimeters(int heightInInches) {

		return heightInInches * 2.54;

	}

	public static double convertToCentimeters(int heightInFeet, int heightInInches) {

		return (heightInFeet * 30.48) + (heightInInches * 2.54);

	}

}
