package decorator.starbuzz.condiment;

import decorator.starbuzz.beverage.Beverage;

public class SteamedMilk extends Condiment {
	
	public SteamedMilk(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return this.getBeverage()
		           .getDescription() + ", Steamed Milk";
	}
	
	@Override
	public double getCost() {
		return this.getBeverage()
		           .getCost() + .10;
	}
}
