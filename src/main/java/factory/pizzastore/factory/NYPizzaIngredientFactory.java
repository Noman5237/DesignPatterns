package factory.pizzastore.factory;

import factory.pizzastore.ingredient.dough.Dough;
import factory.pizzastore.ingredient.dough.ThinCrustDough;
import factory.pizzastore.ingredient.sauce.MarinaraSauce;
import factory.pizzastore.ingredient.sauce.Sauce;
import factory.pizzastore.ingredient.topping.cheese.Cheese;
import factory.pizzastore.ingredient.topping.cheese.ReggianoCheese;
import factory.pizzastore.ingredient.topping.clam.Clam;
import factory.pizzastore.ingredient.topping.clam.FreshClams;
import factory.pizzastore.ingredient.topping.pepperoni.Pepperoni;
import factory.pizzastore.ingredient.topping.pepperoni.SlicedPepperoni;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	@Override
	public Clam createClam() {
		return new FreshClams();
	}
	
	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
}
