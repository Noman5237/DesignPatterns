package decorator.starbuzz.condiment;

import decorator.starbuzz.beverage.Beverage;

public class Mocha extends Condiment {
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return this.getBeverage()
		           .getDescription() + ", Mocha";
	}
	
	@Override
	public double getCost() {
		return this.getBeverage()
		           .getCost() + .20;
	}
}
