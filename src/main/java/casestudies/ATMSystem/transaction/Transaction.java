package casestudies.ATMSystem.transaction;

import casestudies.ATMSystem.bank.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Transaction {
	
	@Getter
	private Account account;
	
	public abstract void execute();
	
}
