package casestudies.ATMSystem.transaction.factory;

import casestudies.ATMSystem.bank.Database;
import casestudies.ATMSystem.transaction.BalanceInquiry;
import casestudies.ATMSystem.transaction.Deposit;
import casestudies.ATMSystem.transaction.Transaction;
import casestudies.ATMSystem.transaction.Withdrawal;

public class TransactionFactory {
	
	public Transaction createBalanceTransaction(Database database, String accountNo) {
		return new BalanceInquiry(database, accountNo);
	}
	
	public Transaction createCreditTransaction(Database database, String accountNo, int amount) {
		return new Deposit(database, accountNo, amount);
	}
	
	public Transaction createDebitTransaction(Database database, String accountNo, int amount) {
		return new Withdrawal(database, accountNo, amount);
	}
	
}
