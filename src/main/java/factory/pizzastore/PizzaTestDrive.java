package factory.pizzastore;

import factory.pizzastore.pizza.Pizza;
import factory.pizzastore.store.CAStylePizzaStore;
import factory.pizzastore.store.ChicagoStylePizzaStore;
import factory.pizzastore.store.NYStylePizzaStore;
import factory.pizzastore.store.PizzaStore;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		PizzaStore caStore= new CAStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered " + pizza.getName() + ".\n");
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered " + pizza.getName() + ".\n");
		pizza = caStore.orderPizza("veggie");
		System.out.println("Karim ordered " + pizza.getName() + ".\n");
	}
}
