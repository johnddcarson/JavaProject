package BankAccount;

import java.util.HashMap;
import java.util.Map;

public class Bank {

	public final int routingNumber;
	private long lasrTransactionID = 1;
	private final Map<String, BankCustomer> customersMap;

	public Bank(int routingNumber) {
		this.routingNumber = routingNumber;
		customersMap = new HashMap<>();

	}

	public BankCustomer getBankCustomer(String id) {
		BankCustomer bankCustomer = customersMap.get(id);
		return bankCustomer;
	}

	public void addCusomter(String name, double checkingDep, double savingDep) {

		BankCustomer addCustomerx = new BankCustomer(name, checkingDep, savingDep);

		customersMap.put(addCustomerx.getCustomerId(), addCustomerx);

	}

	public Boolean doTransaction(String id, BankAccount.AccountType accountType, double amount) {

		BankCustomer customerx = customersMap.get(id);
		if (customerx != null) {
			BankAccount accouunt = customerx.getAccount(accountType);
			if (accouunt != null) {
				if ((accouunt.getBalance() + amount < 0)) {
					System.out.println("Insufficient funds");
				} else {
					accouunt.commitTrans(routingNumber, lasrTransactionID, id, amount);
					return true;
				}
			}
		} else {
			System.out.println("Invailid cusotmer id");
		}
		return false;

	}

}
