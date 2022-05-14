package factory.pizzastore.pizza;

import factory.pizzastore.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}
