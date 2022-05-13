package factory.pizzastore.pizza;

public class VeggiePizza extends Pizza {
	
	@Override
	public void prepare() {
		System.out.println("Preparing with colored vegetables...");
	}
}
