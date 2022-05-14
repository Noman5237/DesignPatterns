package factory.pizzastore.franchise;

import factory.pizzastore.ingredient.veggie.BlackOlives;
import factory.pizzastore.ingredient.veggie.EggPlant;
import factory.pizzastore.ingredient.veggie.Spinach;
import factory.pizzastore.pizza.Pizza;

import java.util.List;

public class ChicagoFranchise extends Franchise {
	
	public ChicagoFranchise(Pizza pizza) {
		super(pizza);
		name = "Chicago Styled " + pizza.getName();
		veggies.addAll(List.of(new Spinach(), new BlackOlives(), new EggPlant()));
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices.");
	}
}
