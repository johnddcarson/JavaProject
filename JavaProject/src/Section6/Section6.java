package Section6;

public class Section6 {

	public static void main(String[] args) {

		int value = 10;

		switch (value) {
		case 1 -> System.out.println("Value was " + value);
		case 2, 3 -> System.out.println("Value was " + value);
		default -> System.out.println("Value was " + value);

		}

		String month = "April";
		System.out.println(month + " is in the " + getQuarter(month) + " quarter");

		char nato = 'x';

		switch (nato) {
		case 'a' -> System.out.println(nato + " = Able");
		case 'b' -> System.out.println(nato + " = Baker");
		case 'c' -> System.out.println(nato + " = Charlie");
		case 'd' -> System.out.println(nato + " = Dog");
		case 'e' -> System.out.println(nato + " = Easy");
		default -> System.out.println(nato);

		}

	}

	public static String getQuarter(String month) {
		return switch (month) {
		case "January", "February", "March" -> "Q1";
		case "April", "May", "June" -> "Q2";
		case "July", "August", "September" -> "Q3";
		case "October", "November", "December" -> "Q4";
		default -> "Invalid Month";
		};
	}
}
