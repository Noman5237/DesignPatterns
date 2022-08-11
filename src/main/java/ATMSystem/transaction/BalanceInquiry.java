package ATMSystem.transaction;

import ATMSystem.bank.Account;

public class BalanceInquiry extends Transaction {
	
	public BalanceInquiry(Account account) {
		super(account);
	}
	
	@Override
	public void execute() {
		System.out.println("Total Balance: " + this.getAccount()
		                                           .getTotalBalance());
		System.out.println("Available Balance: " + this.getAccount()
		                                               .getAvailableBalance());
	}
}
