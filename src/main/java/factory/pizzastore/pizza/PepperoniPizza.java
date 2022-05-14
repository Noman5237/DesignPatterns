package factory.pizzastore.pizza;

import factory.pizzastore.factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
	
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createPepperoni());
	}
}
