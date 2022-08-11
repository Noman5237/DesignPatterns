package ATMSystem.bean;

import ATMSystem.bank.Account;
import ATMSystem.bank.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseBean {
	
	@Bean
	public Database sampleDatabase() {
		var database = new Database();
		database.addAccount(new Account("12345", 1000, 1000, 1234));
		database.addAccount(new Account("54321", 2000, 2000, 4321));
		return database;
	}
	
}
