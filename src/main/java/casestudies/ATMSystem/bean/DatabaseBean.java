package casestudies.ATMSystem.bean;

import casestudies.ATMSystem.bank.Account;
import casestudies.ATMSystem.bank.Database;

public class DatabaseBean {
	
	public static Database sampleDatabase() {
		var database = new Database();
		database.addAccount(new Account("12345", 1000, 1000, 1234));
		database.addAccount(new Account("54321", 2000, 2000, 4321));
		return database;
	}
	
}
