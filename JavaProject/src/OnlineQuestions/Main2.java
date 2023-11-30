package OnlineQuestions;

import java.util.Arrays;

public class Main2 {

	public static void main(String[] args) {

		String beans[] = new String[6];

		Main2 main2 = new Main2();

		System.out.println(main2.$integer());
		System.out.println(main2._longExpanded());
		main2.walk1(1, 2);
		int[] a = { 1, 3 };
		main2.walk1(a);

	}

	int $integer() {
		return 9;
	}

	int _longExpanded() {
		return (int) 9L;
	}

	public void walk1(int... nums) {

		System.out.println(Arrays.toString(nums));

		System.out.println("Yes");
	}
}
