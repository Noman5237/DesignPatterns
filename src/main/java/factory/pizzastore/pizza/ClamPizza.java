package factory.pizzastore.pizza;

public class ClamPizza extends Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing pizza with clam...");
	}
}
