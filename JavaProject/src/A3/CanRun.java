package A3;

public interface CanRun {

	void run5Km();

	public default int getSpeed() {
		return 10;
	}

	static void jump() {
		System.out.println("Jump");
	}

}
