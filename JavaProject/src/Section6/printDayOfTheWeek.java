package Section6;

public class printDayOfTheWeek {

	public static void main(String[] args) {

		for (int value : new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }) {
			printDayOfTheWeek(value);
		}
	}

	public static void printDayOfTheWeek(int day) {
		String dayOfTheWeek = switch (day) {
		case 1 -> {
			yield "Sunday";
		}
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> "Invalid day";
		};
		System.out.println(day + " stands for " + dayOfTheWeek);

	}
}