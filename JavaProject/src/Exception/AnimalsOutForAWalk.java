package Exception;

public class AnimalsOutForAWalk extends RuntimeException {

	public void shout() {
		// Simulate a condition where an exception is thrown
		boolean condition = true;

		if (condition) {
			// throw new AnimalsOutForAWalk();
		}

		System.out.println("Animals are out for a walk!");
	}
}
