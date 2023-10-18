package CompositionChallenge;

public class Main {

	public static void main(String[] args) {

		ComputerCase theComputerCase = new ComputerCase("2208", "Dell", "240");

		Monitor theMonitor = new Monitor("27Inch Beast", "Acer", 27, "2540 x 1440");

		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

		PersonalComputer personalComputer = new PersonalComputer("P14s", "ThinkPad", theComputerCase, theMonitor,
				theMotherboard);

		personalComputer.startPC("Linx");

	}
}
