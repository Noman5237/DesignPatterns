package factory.pizzastore;

import factory.pizzastore.factory.PizzaFactory;
import factory.pizzastore.pizza.Pizza;

public class PizzaStore {
	
	private final PizzaFactory pizzaFactory;
	
	public PizzaStore(PizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = pizzaFactory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
}
