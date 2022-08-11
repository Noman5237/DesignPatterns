package casestudies.ATMSystem;

import casestudies.ATMSystem.bank.Account;
import casestudies.ATMSystem.bank.Database;
import casestudies.ATMSystem.transaction.BalanceInquiry;
import casestudies.ATMSystem.transaction.Deposit;
import casestudies.ATMSystem.transaction.Transaction;
import casestudies.ATMSystem.transaction.Withdrawal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import util.cli.AbortException;
import util.cli.Input;
import util.cli.Menu;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

public class ATM {
	
	private final Database database;
	
	public ATM(Database database) {
		this.database = database;
	}
	
	public void run() {
		System.out.println("Welcome to the ATM");
		while (true) {
			try {
				String accountNo = Input.<String>builder()
				                        .prompt("Enter your account number: ")
				                        .cast(String::new)
				                        .help("Help on account number")
				                        .validate(input -> input.length() == 5)
				                        .onError(input -> System.out.println("Account number must be 5 digits"))
				                        .build()
				                        .get();
				int pin = Input.<Integer>builder()
				               .prompt("Enter your pin: ")
				               .cast(Integer::parseInt)
				               .build()
				               .get();
				Optional<Account> authenticatedUser = database.getAuthenticatedUser(accountNo, pin);
				if (authenticatedUser.isPresent()) {
					this.showMenu(authenticatedUser.get());
				} else {
					System.out.println("Invalid account number or pin");
				}
			} catch (AbortException e) {
				break;
			}
		}
	}
	
	private void showMenu(Account account) {
		
		AtomicBoolean done = new AtomicBoolean(false);
		while (!done.get()) {
			
			try {
				Menu.builder()
				    .prompt("Please choose an operation")
				    .option(Menu.Option.builder()
				                       .prompt("Withdraw")
				                       .help("Withdraw money")
				                       .onSelect(() -> this.withdraw(account))
				                       .build())
				    .option(Menu.Option.builder()
				                       .prompt("Deposit")
				                       .help("Deposit money")
				                       .onSelect(() -> this.credit(account))
				                       .build())
				    .option(Menu.Option.builder()
				                       .prompt("Balance")
				                       .help("Check balance")
				                       .onSelect(() -> this.balance(account))
				                       .build())
				    .option(Menu.Option.builder()
				                       .prompt("Exit")
				                       .help("Exit the ATM")
				                       .onSelect(() -> {
					                       System.out.println("Thank you for using the ATM. Have a nice day!");
					                       done.set(true);
				                       })
				                       .build())
				    .build()
				    .get();
			} catch (AbortException ignored) {
				break;
			}
		}
	}
	
	private void balance(Account account) {
		Transaction balance = new BalanceInquiry(account);
		balance.execute();
	}
	
	private void credit(Account account) {
		try {
			int amount = Input.<Integer>builder()
			                  .prompt("Enter amount: ")
			                  .cast(Integer::parseInt)
			                  .build()
			                  .get();
			Transaction deposit = new Deposit(account, amount);
			deposit.execute();
		} catch (AbortException ignored) {
		}
	}
	
	private void withdraw(Account account) {
		try {
			int amount = Input.<Integer>builder()
			                  .prompt("Enter amount: ")
			                  .cast(Integer::parseInt)
			                  .build()
			                  .get();
			Transaction withdraw = new Withdrawal(account, amount);
			withdraw.execute();
		} catch (AbortException ignored) {
		}
	}
	
}

