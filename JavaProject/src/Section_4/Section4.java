package Section_4;

public class Section4 {

	public static void main(String[] args) {

		double doubleVar1 = 20.00;
		double doubleVar2 = 80.00;
		double calDoubleVar = (doubleVar1 + doubleVar2) * 100.00;
		double remainder = calDoubleVar % 40;
		boolean isremainder = remainder == 0.00 ? true : false;

		System.out.println(isremainder);

		String remainderText = !isremainder ? "Got a Remainder!!" : "No Remainder!!";

		System.out.println(remainderText);

	}

}
