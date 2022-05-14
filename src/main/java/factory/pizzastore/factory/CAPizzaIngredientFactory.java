package factory.pizzastore.factory;

import factory.pizzastore.ingredient.dough.Dough;
import factory.pizzastore.ingredient.dough.VeryThinCrustDough;
import factory.pizzastore.ingredient.sauce.BruschettaSauce;
import factory.pizzastore.ingredient.sauce.Sauce;
import factory.pizzastore.ingredient.topping.cheese.Cheese;
import factory.pizzastore.ingredient.topping.cheese.GoatCheese;
import factory.pizzastore.ingredient.topping.clam.Calamari;
import factory.pizzastore.ingredient.topping.clam.Clam;
import factory.pizzastore.ingredient.topping.pepperoni.Pepperoni;
import factory.pizzastore.ingredient.topping.pepperoni.SlicedPepperoni;

public class CAPizzaIngredientFactory implements PizzaIngredientFactory {
	
	@Override
	public Dough createDough() {
		return new VeryThinCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new BruschettaSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}
	
	@Override
	public Clam createClam() {
		return new Calamari();
	}
	
	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
}
