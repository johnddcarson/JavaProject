package access.goose;

import access.shore.Bird;

public class Goose extends Bird {

	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}

}

/*
 * public void helpGooseSwim() { Goose other = new Goose();
 * other.floatInWater(); System.out.println(other.text); } public void
 * helpOtherGooseSwim() { Bird other = new Goose(); other.floatInWater(); //
 * DOES NOT COMPILE System.out.println(other.text); // DOES NOT COMPILE } }
 */
