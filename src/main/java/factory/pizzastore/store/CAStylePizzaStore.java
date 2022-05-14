package factory.pizzastore.store;

import factory.pizzastore.factory.CAPizzaIngredientFactory;
import factory.pizzastore.factory.PizzaIngredientFactory;
import factory.pizzastore.franchise.CAFranchise;
import factory.pizzastore.pizza.Pizza;
import factory.pizzastore.pizza.Pizzas;

public class CAStylePizzaStore extends PizzaStore {
	
	private final PizzaIngredientFactory pizzaIngredientFactory;
	
	public CAStylePizzaStore() {
		pizzaIngredientFactory = new CAPizzaIngredientFactory();
	}
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = Pizzas.createPizza(type, pizzaIngredientFactory);
		return new CAFranchise(pizza);
	}
}
