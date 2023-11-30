package A1Z0808;

public class mAINcHAP1 {
	int count;
	int amount = 0xE;
	int roomInBelly = 5;
	public static int COUNT = 4;

	public mAINcHAP1() {
		this.count = 4;
	}

	public void eatCheese(int bitesOfCheese) {
		int count = 0;
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
			count++;
			System.out.println(count);

			if (count == 3) {
				break;
			}

		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}

	public static void main(String[] args) {
		mAINcHAP1 f = new mAINcHAP1();
		/*
		 * int x = 10, y = 20; double z = 10; if (x == y) { System.out.println("Dif"); }
		 * 
		 * String john = "John"; String heather; heather = new String("John"); //
		 * heather = heather.concat("John");
		 * 
		 * StringBuilder johnBuilder = new StringBuilder("John"); StringBuilder
		 * heatherBuilder = new StringBuilder("John");
		 * 
		 * if (john == heather) { System.out.println("Hello"); }
		 */

		int hourOfDay = 100;
		int morningGreetingCount = 3;

		boolean testb = true;
		if (!testb)
			System.out.println("Good Morning");
		morningGreetingCount++;

		System.out.println(morningGreetingCount == 1 ? "Yes" : "No");

		String dayOfWeek = "Friday";

		switch (dayOfWeek) {
		case "Monday":
			System.out.println("It's the start of the week");
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			System.out.println("It's a weekday");
			break;
		case "Friday":
			System.out.println("TGIF!");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("It's the weekend");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}

		f.eatCheese(10);

		int count2 = 0;
		do {
			System.out.println("Print DO");
			count2++;

		} while (count2 < 10);
		System.out.println("Print while " + count2);

		while (count2 < 20) {

			System.out.println("Print while DO");
			count2++;

		}

		// int x = 0;
		// long y = 10;
		int x = 20;
		while (x > 0) {
			do {
				x -= 2;
			} while (x > 5);
			x--;
			System.out.println(x);
		}

		for (int a = 1; a <= 4; a++) {
			for (char x1 = 'a'; x1 <= 'c'; x1++) {
				if (a == 2 || x1 == 'b')
					continue;
				System.out.print(" " + a + x1);
			}
		}
	}

}
