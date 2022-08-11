package casestudies.ATMSystem;

import casestudies.ATMSystem.bank.Database;
import casestudies.ATMSystem.bean.DatabaseBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ATMSimulator {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DatabaseBean.class);
		Database database = (Database) applicationContext.getBean("sampleDatabase");
		ATM atm = new ATM(database);
		atm.run();
	}
}
