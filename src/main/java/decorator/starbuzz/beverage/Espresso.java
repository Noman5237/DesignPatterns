package decorator.starbuzz.beverage;

public class Espresso extends Beverage {
	
	@Override
	public String getDescription() {
		return "Espresso";
	}
	
	@Override
	public double getCost() {
		return 1.99;
	}
}
