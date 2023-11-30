package Chap5;

public interface Parent3 {
	int count = 1;

	void interMethod();

	default void defaultMeathod() {

		System.out.println("Hello Interface");
	}

	static void jump() {
		System.out.println();
	}

}
