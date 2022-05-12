package decorator.starbuzz.beverage;

public class Decaf extends Beverage {
	
	public Decaf(Size size) {
		super(size);
	}
	
	@Override
	public String getDescription() {
		return "Decaf";
	}
	
	@Override
	public double getCost() {
		return 1.05;
	}
}
