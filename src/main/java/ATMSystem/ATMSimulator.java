package ATMSystem;

import ATMSystem.bank.Database;

public class ATMSimulator {
	
	static Database database;
	
	public static void main(String[] args) {
		System.out.println(database);
		ATM atm = new ATM(database);
		atm.run();
	}
}
