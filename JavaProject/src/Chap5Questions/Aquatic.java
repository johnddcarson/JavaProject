package Chap5Questions;

public interface Aquatic {

	public static final int abc = 10;

	public default int getNumberOfGills(int input) {
		return 2;
	}
}
