package BankAccount;

public class Transaction {

	private int routingNumber;
	private long transactionId;
	private int customerID;
	private double amount;

	public Transaction(int routingNumber, long transactionId, int customerID, double amount) {
		this.routingNumber = routingNumber;
		this.transactionId = transactionId;
		this.customerID = customerID;
		this.amount = amount;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "%015d:%020d:%015d;%012.2f".formatted(routingNumber, customerID, transactionId, amount);
	}

}
