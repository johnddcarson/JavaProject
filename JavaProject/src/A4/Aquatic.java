package A4;

public interface Aquatic {

	public default int getNumberOfGills(int input) {
		return 2;
	}
}