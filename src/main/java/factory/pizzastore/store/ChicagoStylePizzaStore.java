package factory.pizzastore.store;

import factory.pizzastore.factory.ChicagoPizzaIngredientFactory;
import factory.pizzastore.factory.PizzaIngredientFactory;
import factory.pizzastore.franchise.ChicagoFranchise;
import factory.pizzastore.pizza.Pizza;
import factory.pizzastore.pizza.Pizzas;

public class ChicagoStylePizzaStore extends PizzaStore {
	
	private final PizzaIngredientFactory pizzaIngredientFactory;
	
	public ChicagoStylePizzaStore() {
		pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
	}
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = Pizzas.createPizza(type, pizzaIngredientFactory);
		return new ChicagoFranchise(pizza);
	}
}
