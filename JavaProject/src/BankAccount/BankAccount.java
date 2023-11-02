package BankAccount;

import java.util.LinkedHashMap;
import java.util.Map;

public class BankAccount {

	public enum AccountType {
		CHECKING, SAVINGS
	}

	private final AccountType accountType;

	private double balance;

	private final Map<Long, Transaction> transaction = new LinkedHashMap<>();

	BankAccount(AccountType accountType, double balance) {
		this.accountType = accountType;
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public double getBalance() {
		return balance;
	}

	public Map<Long, String> getTransaction() {
		Map<Long, String> txMap = new LinkedHashMap<Long, String>();
		for (var tx : transaction.entrySet()) {
			txMap.put(tx.getKey(), tx.getValue().toString());
		}
		return txMap;
	}

	void commitTrans(int routingNumber, long TransID, String CustomerID, double amount) {

		balance += amount;
		transaction.put(TransID, new Transaction(routingNumber, TransID, Integer.parseInt(CustomerID), amount));

	}

	@Override
	public String toString() {
		return "BankAccount: AccountType=" + accountType + ", Balance=" + balance + "]";
	}

}
