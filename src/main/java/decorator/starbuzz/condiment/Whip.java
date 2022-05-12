package decorator.starbuzz.condiment;

import decorator.starbuzz.beverage.Beverage;

public class Whip extends Condiment {
	
	public Whip(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return this.getBeverage()
		           .getDescription() + ", Whip";
	}
	
	@Override
	public double getCost() {
		return this.getBeverage()
		           .getCost() + .10;
	}
}
