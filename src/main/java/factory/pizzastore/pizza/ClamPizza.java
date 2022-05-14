package factory.pizzastore.pizza;

import factory.pizzastore.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createClam());
	}
}
