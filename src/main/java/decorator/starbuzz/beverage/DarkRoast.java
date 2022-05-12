package decorator.starbuzz.beverage;

public class DarkRoast extends Beverage {
	
	@Override
	public String getDescription() {
		return "Dark Roast";
	}
	
	@Override
	public double getCost() {
		return 0.99;
	}
}
