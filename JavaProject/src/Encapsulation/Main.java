package Encapsulation;

public class Main {

	public static void main(String[] args) {

		Player johnPlayer = new Player("John", 1200, "Gun");

		System.out.println(johnPlayer.healthRemaining());

		johnPlayer.loseHealth(50);

		System.out.println(johnPlayer.healthRemaining());

		johnPlayer.restoreHealth(100);

		System.out.println(johnPlayer.healthRemaining());
		System.out.println();
		Printer printer = new Printer(50, false);

		System.out.println("Initial page count " + printer.getPagesPrinted());

		printer.printPages(5);

		System.out.println("Page count " + printer.getPagesPrinted());

		printer.printPages(10);

		System.out.println("Page count " + printer.getPagesPrinted());

	}

}
