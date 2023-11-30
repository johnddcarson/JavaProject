package A4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	double d4 = 1_234.0;

	public static void main(String _args[]) {

		Main brand = new Main();

		// Print the element at row 2 (index 2 - 1) and column 1 (index 0)
		System.out.println(brand.d4);

		List<String> a = new ArrayList<>();

		a.add("John");
		a.add("Aohn");

		Collections.sort(a);

		System.out.println(a);

	}

}
