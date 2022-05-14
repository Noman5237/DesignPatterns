package factory.pizzastore.franchise;

import factory.pizzastore.pizza.Pizza;

public abstract class Franchise extends Pizza {
	
	public Franchise(Pizza pizza) {
		pizza.copyTo(this);
	}
	
	@Override
	public String getName() {
		return name;
	}
}
