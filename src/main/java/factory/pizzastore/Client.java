package factory.pizzastore;

import factory.pizzastore.factory.SimplePizzaFactory;
import factory.pizzastore.pizza.Pizza;

public class Client {
	
	public static void main(String[] args) {
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		var clamPizza = pizzaStore.orderPizza("clam");
		var cheesePizza = pizzaStore.orderPizza("cheese");
	}
}
