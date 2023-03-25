package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Database;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Transaction {
	
	private Database database;
	private String accountNo;
	
	public abstract void execute();
	
}
