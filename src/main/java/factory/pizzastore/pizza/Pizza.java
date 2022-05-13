package factory.pizzastore.pizza;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected final List<String> toppings = new ArrayList<>();
	
	public void prepare() {
		System.out.format("Preparing %s.\n", name);
		System.out.format("Tossing %s.\n", dough);
		System.out.format("Adding %s.\n", sauce);
		System.out.format("Adding toppings: %s.\n", toppings.stream()
		                                                    .reduce((topping, accumulator) -> accumulator + ", " + topping)
		                                                    .orElse("None"));
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
	
}
