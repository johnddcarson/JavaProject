package Exception;

public class Mian {
	private String brand;
	private boolean empty;

	public static void main(String[] args) {
		Mian wb = new Mian();
		System.out.print("Empty = " + wb.empty);
		System.out.println(", Brand = " + wb.brand);

		String a, b;

		a = "ABC";
		b = "ABC";
		// String b = new String("Message");
		// String c = a;

		System.out.println(a == b);
		// System.out.println(a == c);
		// System.out.println(b.equals(c));

	}

}
