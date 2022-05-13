package factory.pizzastore.pizza;

public abstract class Pizza {
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Baking pizza...");
	}
	
	public void cut() {
		System.out.println("Cutting pizza...");
	}
	
	public void box() {
		System.out.println("Boxing pizza...");
	}
	
}
