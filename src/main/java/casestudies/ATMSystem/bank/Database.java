package casestudies.ATMSystem.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Database {
	
	private final Map<String, Account> accounts;
	
	public Database() {
		this.accounts = new HashMap<>();
	}
	
	public Optional<Account> getAuthenticatedUser(String accountNumber, int pin) {
		Account account = this.accounts.get(accountNumber);
		
		if (account == null) {
			return Optional.empty();
		}
		if (account.validatePin(pin)) {
			return Optional.of(account);
		}
		
		return Optional.empty();
	}
	
	public void addAccount(Account account) {
		this.accounts.put(account.getAccountNumber(), account);
	}
}
