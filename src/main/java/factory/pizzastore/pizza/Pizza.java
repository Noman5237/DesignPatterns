package factory.pizzastore.pizza;

import factory.pizzastore.ingredient.dough.Dough;
import factory.pizzastore.ingredient.sauce.Sauce;
import factory.pizzastore.ingredient.topping.Topping;
import factory.pizzastore.ingredient.veggie.Veggie;
import lombok.Getter;
import util.Formatting;

import java.util.ArrayList;
import java.util.List;

import static util.Formatting.formatClassName;

@Getter
public abstract class Pizza {
	
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected final List<Veggie> veggies = new ArrayList<>();
	protected final List<Topping> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.format("Preparing %s.\n", getName());
		System.out.format("Tossing %s.\n", formatClassName(getDough()));
		System.out.format("Spooning %s.\n", formatClassName(getSauce()));
		
		if (!veggies.isEmpty()) {
			System.out.format("Mixing %s.\n",
			                  veggies.stream()
			                         .map(Formatting::formatClassName)
			                         .reduce((veggie, accumulator) -> accumulator + ", " + veggie)
			                         .get());
		}
		
		if (!toppings.isEmpty()) {
			System.out.format("Adding %s.\n",
			                  toppings.stream()
			                          .map(Formatting::formatClassName)
			                          .reduce((topping, accumulator) -> accumulator + ", " + topping)
			                          .get());
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350.");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices.");
	}
	
	public void box() {
		System.out.println("Placing pizza in official PizzaStore box.");
	}
	
	public void copyTo(Pizza pizza) {
		pizza.name = name;
		pizza.dough = dough;
		pizza.sauce = sauce;
		pizza.veggies.addAll(veggies);
		pizza.toppings.addAll(toppings);
	}
	
	public String getName() {
		return formatClassName(this);
	}
}
