package Chap5;

public interface Mammal3 {

	public int eatPlants(int quantity);

	public void drinkWater(double amount);

	public default int getSpeed() {
		return 5;
	}

	public static int getJumpHeight() {
		return 80;
	}

}
