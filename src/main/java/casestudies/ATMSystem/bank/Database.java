package casestudies.ATMSystem.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Database {
	
	private final Map<String, Account> accounts;
	
	public Database() {
		this.accounts = new HashMap<>();
	}
	
	private Optional<Account> getAccount(String accountNo) {
		Account account = this.accounts.get(accountNo);
		
		if (account == null) {
			return Optional.empty();
		}
		
		return Optional.of(account);
	}
	
	public boolean authenticateUser(String accountNo, int pin) {
		return this.getAccount(accountNo)
		           .map(account -> account.validatePin(pin))
		           .orElse(false);
	}
	
	public void credit(String accountNo, int amount) {
		this.getAccount(accountNo)
		    .ifPresent(account -> account.credit(amount));
	}
	
	public void debit(String accountNo, int amount) {
		this.getAccount(accountNo)
		    .ifPresent(account -> account.debit(amount));
	}
	
	/* ================================ UTILITY ==================================== */
	
	public void addAccount(Account account) {
		this.accounts.put(account.getAccountNumber(), account);
	}
	
}
