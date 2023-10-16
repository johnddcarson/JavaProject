package Section7;

public class Main {

	public static void main(String[] args) {

		/*
		 * BankAcount johnAccount = new BankAcount(123, 0, "John", "John@Hotmail",
		 * 0775);
		 * 
		 * johnAccount.showBalance(); johnAccount.depositCash(10);
		 * 
		 * johnAccount.withdrawCash(30); johnAccount.withdrawCash(5);
		 * System.out.println(johnAccount);
		 */

		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
	}

}