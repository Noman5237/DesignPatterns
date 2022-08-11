package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Account;

public class Withdrawal extends Transaction {
	
	private final int amount;
	
	public Withdrawal(Account account, int amount) {
		super(account);
		this.amount = amount;
	}
	
	@Override
	public void execute() {
		if (this.getAccount()
		        .getTotalBalance() - this.amount < 0) {
			throw new IllegalArgumentException("Insufficient funds");
		}
		this.getAccount()
		    .debit(amount);
	}
}
