package ExceptionExam;

public class Cat {
	{
		System.out.println("Instance created");
	}
	public String name;

	public void parseName() {

		System.out.println("1");

		try {
			System.out.print("2");
			int x = Integer.parseInt(name);
			System.out.print("3");
		} catch (NullPointerException e) {
			System.out.print("4");
		} finally {
			System.out.print("C");
		}

	}

	public int notValid() {
		int y = 10;
		int x = y;
		// int reply = x + y; // DOES NOT COMPILE
		return x + y;
	}

	public static void main(String[] args) {
		Cat leo = new Cat();
		leo.name = "1";
		leo.parseName();
		// System.out.print("6");
		String[] array = { "Hello", "World" };
		System.out.println();
		// Animal.main(array);

	}
}