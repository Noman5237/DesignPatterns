package casestudies.ATMSystem.atm;

import util.cli.AbortException;
import util.cli.Input;

public class Keypad {
	
	public String getAccountNo() throws AbortException {
		
		return Input.<String>builder()
		            .prompt("Enter your account number: ")
		            .cast(String::new)
		            .onError(input -> System.out.println("Account number must be 5 digits"))
		            .build()
		            .get();
	}
	
	public int getPin() throws AbortException {
		return Input.<Integer>builder()
		            .prompt("Enter your account pin: ")
		            .cast(Integer::parseInt)
		            .validate(input -> input.length() == 4)
		            .build()
		            .get();
	}
	
	public int getAmount() throws AbortException {
		return Input.<Integer>builder()
		            .prompt("Enter transaction amount: ")
		            .cast(Integer::parseInt)
		            .condition(amount -> amount < 20000,
		                       (amount) -> System.out.println("Max limit of per transaction is 20000"))
		            .build()
		            .get();
	}
	
}
