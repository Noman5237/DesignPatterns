package factory.pizzastore.factory;

import factory.pizzastore.pizza.Pizza;

public interface PizzaFactory {
	
	Pizza createPizza(String type);
}
