package AutoBoxing;

import java.util.ArrayList;

record Customer(String name, java.util.ArrayList<Double> transZ) {

	public Customer(String name, double initialDeposit) {
		this(name.toUpperCase(), new ArrayList<Double>(500));

		transZ.add(initialDeposit);
	}
}

public class Main {

	public static void main(String[] args) {

		Customer bobCustomer = new Customer("Bob", 1000);
		System.out.println(bobCustomer);

		Bank bank = new Bank("Chase");
		bank.addNewCustomer("John", 500);
		System.out.println(bank);

		bank.addTrans("John", 222);
		bank.addTrans("John", -100);

		bank.printStatement("John");
	}

}

class Bank {

	private String nameString;

	private ArrayList<Customer> customers = new ArrayList<>(5000);

	public Bank(String nameString) {
		this.nameString = nameString;
	}

	private Customer getCustomer(String customerName) {

		for (var customer : customers) {
			if (customer.name().equalsIgnoreCase(customerName)) {
				return customer;
			}
		}
		System.out.println("Customer not found");
		return null;

	}

	public void addNewCustomer(String customerName, double initialDeposit) {

		if (getCustomer(customerName) == null) {
			Customer customer = new Customer(customerName, initialDeposit);
			customers.add(customer);
			System.out.println("New customer added " + customerName);

		}

	}

	public void addTrans(String nameString, double transAmount) {

		Customer customer = getCustomer(nameString);
		if (customer != null) {
			customer.transZ().add(transAmount);
		}

	}

	public void printStatement(String customerName) {

		Customer customer = getCustomer(customerName);
		if (customer == null) {
			return;
		}

		System.out.println("-".repeat(30));
		System.out.println("Customer Name: " + customer.name());
		System.out.println("Transactions:");
		for (double d : customer.transZ()) { // unboxing
			System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
		}

	}

	@Override
	public String toString() {
		return "Bank [nameString=" + nameString + ", customers=" + customers + "]";
	}

}