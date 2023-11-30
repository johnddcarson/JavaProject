package Interview;

public class Account {
	int grad;
	int acount;
	String firstName, lastName;
	double creditLimit;
	double balance;
	boolean recentClaim;
	int yearNoClaims;

	public Account() {
	}

	public Account(int acount, String firstName, String lastName, double creditLimit, double balance,
			boolean recentClaim, int yearNoClaims) {
		super();
		this.acount = acount;
		this.firstName = firstName;
		this.lastName = lastName;
		this.creditLimit = creditLimit;
		this.balance = balance;
		this.recentClaim = recentClaim;
		this.yearNoClaims = yearNoClaims;
	}

	public double discount() {
		return 10.0;
	}

	public double quotation(double cost) {

		return cost - cost * discount();
	}

	@Override
	public String toString() {
		return "Account [acount=" + acount + ", firstName=" + firstName + ", lastName=" + lastName + ", creditLimit="
				+ creditLimit + ", balance=" + balance + ", recentClaim=" + recentClaim + ", yearNoClaims="
				+ yearNoClaims + "]";
	}

	public static void main(String... $args) {

		Account[] ac = new Account[4];

		ac[0] = new Account(123, "John", "Carson", 10, 500, false, 0);

		System.out.println(ac[0]);
		ac[0] = new Account();
		System.out.println(ac[0]);

		int mark = 30;

		System.out.println("Test ");

		if (mark < 40) {
			System.out.println("Hello");
		} else {
			System.out.println("Yes");

		}
	}

}
