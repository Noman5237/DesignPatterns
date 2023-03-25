package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Account;
import casestudies.ATMSystem.bank.Database;

public class Withdrawal extends Transaction {
	
	private final int amount;
	
	public Withdrawal(Database database, String account, int amount) {
		super(database, account);
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		this.getDatabase()
		    .debit(this.getAccountNo(), amount);
	}
}
