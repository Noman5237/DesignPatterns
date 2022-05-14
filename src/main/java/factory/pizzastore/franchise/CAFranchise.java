package factory.pizzastore.franchise;

import factory.pizzastore.ingredient.veggie.EggPlant;
import factory.pizzastore.ingredient.veggie.Mushroom;
import factory.pizzastore.ingredient.veggie.Onion;
import factory.pizzastore.ingredient.veggie.Spinach;
import factory.pizzastore.pizza.Pizza;

import java.util.List;

public class CAFranchise extends Franchise {
	
	public CAFranchise(Pizza pizza) {
		super(pizza);
		name = "California Styled " + pizza.getName();
		veggies.addAll(List.of(new Spinach(), new Mushroom(), new EggPlant(), new Onion()));
	}
}
