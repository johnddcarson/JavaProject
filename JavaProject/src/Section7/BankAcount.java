package Section7;

public class BankAcount {

	private int accountNumber;
	private double balance;
	private String name;
	private String email;
	private long phone;

	public BankAcount(int accountNumber, double balance, String name, String email, long phone) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public void showBalance() {
		System.out.println("Your balance is " + balance);

	}

	public void depositCash(double cashIn) {

		balance += cashIn;
		System.out.println("Successful deposit, Your new balance is " + balance);

	}

	public void withdrawCash(double cashOut) {

		if (balance - cashOut < 0) {
			System.out.println("Withdrawal declined, Insufficient funds. Your balance is " + balance
					+ ". You can not withdraw  " + cashOut);
		} else {

			balance -= cashOut;
			System.out.println("Successful withdrawal, Your new balance is " + balance);
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "BankAcount accountNumber=" + accountNumber + ", balance=" + balance + ", name=" + name + ", email="
				+ email + ", phone=" + phone;
	}

}
