package factory.pizzastore.factory;

import factory.pizzastore.ingredient.dough.Dough;
import factory.pizzastore.ingredient.sauce.Sauce;
import factory.pizzastore.ingredient.topping.cheese.Cheese;
import factory.pizzastore.ingredient.topping.clam.Clam;
import factory.pizzastore.ingredient.topping.pepperoni.Pepperoni;

public interface PizzaIngredientFactory {
	
	Dough createDough();
	
	Sauce createSauce();
	
	Cheese createCheese();
	
	Clam createClam();
	
	Pepperoni createPepperoni();
	
}
