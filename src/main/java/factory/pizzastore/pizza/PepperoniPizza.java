package factory.pizzastore.pizza;

public class PepperoniPizza extends Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing pizza with pepperoni...");
	}
}
