package Section_5;

public class SecondsMinutesChallenge {

	public static void main(String[] args) {

		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(65, 45));
	}

	public static String getDurationString(int seconds) {

		if (seconds >= 0) {

			int hours = seconds / 3600;
			int remainingSeconds = seconds % 3600;
			int minutes = remainingSeconds / 60;
			int secs = remainingSeconds % 60;

			return hours + "h " + minutes + "m " + secs + "ss";
		} else {
			return "Invalid";
		}

	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes >= 0) {
			int totalSecs = (minutes * 60) + seconds;
			int hours = totalSecs / 3600;
			int remainingSeconds = totalSecs % 3600;
			int minute = remainingSeconds / 60;
			int secs = remainingSeconds % 60;

			return hours + "h " + minute + "m " + secs + "ss";
		} else {
			return "Invalid";
		}

	}
}