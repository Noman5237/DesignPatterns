package decorator.starbuzz.beverage;

public class Decaf extends Beverage {
	
	@Override
	public String getDescription() {
		return "Decaf";
	}
	
	@Override
	public double getCost() {
		return 1.05;
	}
}
