package factory.pizzastore.factory;

import factory.pizzastore.ingredient.dough.Dough;
import factory.pizzastore.ingredient.dough.ThickCrustDough;
import factory.pizzastore.ingredient.sauce.PlumTomatoSauce;
import factory.pizzastore.ingredient.sauce.Sauce;
import factory.pizzastore.ingredient.topping.cheese.Cheese;
import factory.pizzastore.ingredient.topping.cheese.MozzarellaCheese;
import factory.pizzastore.ingredient.topping.clam.Clam;
import factory.pizzastore.ingredient.topping.clam.FrozenClams;
import factory.pizzastore.ingredient.topping.pepperoni.Pepperoni;
import factory.pizzastore.ingredient.topping.pepperoni.SlicedPepperoni;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}
	
	@Override
	public Clam createClam() {
		return new FrozenClams();
	}
	
	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
}
