package factory.pizzastore.pizza;

import factory.pizzastore.factory.PizzaIngredientFactory;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Optional;

public enum Pizzas {
	CHEESE("cheese", CheesePizza.class),
	CLAM("clam", ClamPizza.class),
	PEPPERONI("pepperoni", PepperoniPizza.class),
	VEGGIE("veggie", VeggiePizza.class);
	
	private final String type;
	private final Class<? extends Pizza> pizzaClass;
	
	Pizzas(String type, Class<? extends Pizza> pizzaClass) {
		this.type = type;
		this.pizzaClass = pizzaClass;
	}
	
	@SneakyThrows
	public static Pizza createPizza(String type, PizzaIngredientFactory ingredientFactory) {
		Optional<Pizzas> pizzaClass = Arrays.stream(Pizzas.values())
		                                    .filter(pizza -> pizza.type.equalsIgnoreCase(type))
		                                    .findFirst();
		if (pizzaClass.isEmpty()) {
			throw new IllegalArgumentException();
		}
		
		try {
			Constructor<? extends Pizza> pizzaConstructor = pizzaClass.get().pizzaClass.getDeclaredConstructor(
					PizzaIngredientFactory.class);
			return pizzaConstructor.newInstance(ingredientFactory);
		} catch (InstantiationException exception) {
			throw new IllegalArgumentException(exception);
		}
	}
}
