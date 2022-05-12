package decorator.starbuzz.beverage;

public class HouseBlend extends Beverage {
	
	public HouseBlend(Size size) {
		super(size);
	}
	
	@Override
	public String getDescription() {
		return "House Blend";
	}
	
	@Override
	public double getCost() {
		return 0.89;
	}
}
