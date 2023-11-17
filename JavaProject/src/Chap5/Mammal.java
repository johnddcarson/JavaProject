package Chap5;

public interface Mammal {

	public final String myName = "Interface";

	public int getlegs();

	public void eatPlants();

	public void drinkWater(int amount);

	public default void eatPlantsDefault() {

		System.out.println("eat Plants Default method");

	}

	public default int getSpeed() {
		return 10;
	}

	public static int getJumpHeight() {
		return 8;
	}

}
