package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Account;

public class Deposit extends Transaction {
	
	private final int amount;
	
	public Deposit(Account account, int amount) {
		super(account);
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		this.getAccount()
		    .credit(amount);
	}
}
