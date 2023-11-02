package ConstructorProject;

import java.util.Random;

public class Child extends Parent {

	private final int birthOrder = getBirthOrder();
	private final String birthOrderString;

	{

		birthOrderString = "First out";

	}

	public Child() {
		super("Jane", "10/10/1990", 1);

	}

	private final int getBirthOrder() {
		if (siblings == 0) {
			return 1;
		}
		return new Random().nextInt(1, siblings + 1); // Corrected line
	}

	@Override
	public String toString() {
		return super.toString() + " Child [birthOrder=" + birthOrder + ", birthOrderString=" + birthOrderString + "]";
	}

}
