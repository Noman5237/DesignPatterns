package factory.pizzastore.store;

import factory.pizzastore.pizza.Pizza;
import factory.pizzastore.pizza.chicago.ChicagoStyleCheesePizza;
import factory.pizzastore.pizza.newyork.NYStyleCheesePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		switch (type) {
			case "cheese":
				pizza = new ChicagoStyleCheesePizza();
				break;
		}
		
		return pizza;
	}
}
