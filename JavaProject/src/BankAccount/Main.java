package BankAccount;

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank(3214567);
		bank.addCusomter("Joe", 500.00, 10000.00);

		BankCustomer joe = bank.getBankCustomer("000000010000000");
		System.out.println(joe);

		if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, 35)) {
			System.out.println(joe);
		}

		if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, -10)) {
			System.out.println(joe);
		}
		if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING, -20)) {
			System.out.println(joe);
		}

		BankAccount checking = joe.getAccount(BankAccount.AccountType.CHECKING);
		var transactions = checking.getTransaction();
		transactions.forEach((k, v) -> System.out.println(k + ": " + v));

		joe.getAccount(BankAccount.AccountType.CHECKING).getTransaction().clear();
		System.out.println("------------------");
		joe.getAccount(BankAccount.AccountType.CHECKING).getTransaction()
				.forEach((k, v) -> System.out.println(k + ": " + v));

	}

}
