package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Account;
import casestudies.ATMSystem.bank.Database;

public class Deposit extends Transaction {
	
	private final int amount;
	
	public Deposit(Database database, String account, int amount) {
		super(database, account);
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		this.getDatabase()
		    .credit(this.getAccountNo(), amount);
	}
}
