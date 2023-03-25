package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Database;

public class BalanceInquiry extends Transaction {
	
	public BalanceInquiry(Database database, String accountNo) {
		super(database, accountNo);
	}
	
	@Override
	public void execute() {
	
	}
}
