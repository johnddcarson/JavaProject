package access.goose;

import access.shore.Bird;

public class Gosling extends Bird {

	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
		System.out.println(textStatic);
	}

}
