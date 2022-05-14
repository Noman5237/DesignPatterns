package factory.pizzastore.pizza;

import factory.pizzastore.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		toppings.add(ingredientFactory.createCheese());
	}
}
