package Chap5Questions;

interface CanHop {

	public static final int Goal1 = 2;
	int Goal2 = 2;

	public static void getNumber() {

		System.out.println("Hello");
	}

	public abstract Object getWing();

	public default boolean isBlind() {
		return true;
	}
}
