package access.inland;

import access.shore.Bird;

public class BirdWatcherFromAfar {

	public void watchBird() {
		Bird bird = new Bird();
		bird.floatInWater(); // DOES NOT COMPILE
		// 178 Chapter 4 ■ Methods and Encapsulation
		System.out.println(bird.text); // DOES NOT COMPILE
	}
}