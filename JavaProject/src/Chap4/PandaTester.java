package Chap4;

import static Chap4.Panda.walk1;
import static Chap5.Mammal.getJumpHeight;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class PandaTester {

	static {
		System.out.println("Static run");
	}
	{
		System.out.println("Not static run");
	}
	static {
		System.out.println("Static run 2");
	}

	public static void main(String[] args) {

		Panda panda = new Panda();

		List<String> list = new ArrayList<String>(asList("one", "two"));

		walk1(1, 4);

		System.out.println("Jump height is " + getJumpHeight());

		// walk1(1, 2);

	}

}
