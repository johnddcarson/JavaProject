package A3;

public interface CanSwim {

	void swim5Km();

	public default int getSpeed() {
		return 5;
	}

}
