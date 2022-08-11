package casestudies.ATMSystem.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Account {
	
	@Getter
	private String accountNumber;
	
	@Getter
	private double availableBalance;
	
	@Getter
	private double totalBalance;
	
	private int pin;
	
	public boolean validatePin(int pin) {
		return this.pin == pin;
	}
	
	public void credit(int amount) {
		this.availableBalance += amount;
		this.totalBalance += amount;
	}
	
	public void debit(int amount) {
		this.availableBalance -= amount;
		this.totalBalance -= amount;
	}
}
