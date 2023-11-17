package access.duck;

import access.goose.Goose;
import access.shore.Bird;

public class GooseWatcher extends Bird {

	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);

		System.out.println(textStatic);
	}

	public void helpOtherGooseSwim() {
		Bird other = new Goose();
		other.floatInWater(); // DOES NOT COMPILE
		System.out.println(other.text); // DOES NOT COMPILE
	}

}
