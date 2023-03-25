package casestudies.ATMSystem.atm;

import casestudies.ATMSystem.bank.Database;
import casestudies.ATMSystem.transaction.Transaction;
import casestudies.ATMSystem.transaction.factory.TransactionFactory;
import lombok.RequiredArgsConstructor;
import util.cli.AbortException;
import util.cli.Menu;

import java.util.concurrent.atomic.AtomicBoolean;

@RequiredArgsConstructor
public class ATM {
	
	private final Database database;
	
	private static final Keypad KEYPAD;
	private static final Screen SCREEN;
	private final TransactionFactory transactionFactory;
	
	static {
		KEYPAD = new Keypad();
		SCREEN = new Screen();
	}
	
	public void run() {
		System.out.println("Welcome to the ATM");
		while (true) {
			try {
				String accountNo = ATM.KEYPAD.getAccountNo();
				int pin = ATM.KEYPAD.getPin();
				boolean currentUserAuthenticated = database.authenticateUser(accountNo, pin);
				if (currentUserAuthenticated) {
					this.showMenu(accountNo);
				} else {
					System.out.println("Invalid account number or pin");
				}
			} catch (AbortException e) {
				break;
			}
		}
	}
	
	private void showMenu(String accountNo) {
		AtomicBoolean done = new AtomicBoolean(false);
		while (!done.get()) {
			try {
				Menu.builder()
				    .prompt("Please choose an operation")
				    .option(Menu.Option.builder()
				                       .prompt("Withdraw")
				                       .help("Withdraw money")
				                       .onSelect(() -> this.withdraw(accountNo))
				                       .build())
				    .option(Menu.Option.builder()
				                       .prompt("Deposit")
				                       .help("Deposit money")
				                       .onSelect(() -> this.deposit(accountNo))
				                       .build())
				    .option(Menu.Option.builder()
				                       .prompt("Balance")
				                       .help("Check balance")
				                       .onSelect(() -> this.balance(accountNo))
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
	
	private void balance(String accountNo) {
		Transaction balanceTransaction = transactionFactory.createBalanceTransaction(database, accountNo);
		balanceTransaction.execute();
	}
	
	private void deposit(String accountNo) {
		try {
			int amount = ATM.KEYPAD.getAmount();
			Transaction creditTransaction = transactionFactory.createCreditTransaction(database, accountNo, amount);
			creditTransaction.execute();
		} catch (AbortException ignored) {
		}
	}
	
	private void withdraw(String accountNo) {
		try {
			int amount = ATM.KEYPAD.getAmount();
			Transaction debitTransaction = transactionFactory.createDebitTransaction(database, accountNo, amount);
			debitTransaction.execute();
		} catch (AbortException ignored) {
		}
	}
	
}

