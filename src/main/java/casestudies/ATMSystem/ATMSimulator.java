package casestudies.ATMSystem;

import casestudies.ATMSystem.atm.ATM;
import casestudies.ATMSystem.bank.Database;
import casestudies.ATMSystem.bean.DatabaseBean;
import casestudies.ATMSystem.transaction.factory.TransactionFactory;

public class ATMSimulator {
	
	public static void main(String[] args) {
		Database database = DatabaseBean.sampleDatabase();
		ATM atm = new ATM(database, new TransactionFactory());
		atm.run();
	}
}
