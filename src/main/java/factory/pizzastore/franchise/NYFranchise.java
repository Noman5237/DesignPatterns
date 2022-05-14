package factory.pizzastore.franchise;

import factory.pizzastore.ingredient.veggie.Garlic;
import factory.pizzastore.ingredient.veggie.Mushroom;
import factory.pizzastore.ingredient.veggie.Onion;
import factory.pizzastore.ingredient.veggie.RedPepper;
import factory.pizzastore.pizza.Pizza;

import java.util.List;

public class NYFranchise extends Franchise {
	
	public NYFranchise(Pizza pizza) {
		super(pizza);
		name = "New York Styled " + pizza.getName();
		veggies.addAll(List.of(new Garlic(), new Onion(), new Mushroom(), new RedPepper()));
	}
}
