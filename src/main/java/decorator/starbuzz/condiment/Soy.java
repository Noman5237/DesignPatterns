package decorator.starbuzz.condiment;

import decorator.starbuzz.beverage.Beverage;

public class Soy extends Condiment {
	
	public Soy(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return this.getBeverage()
		           .getDescription() + ", Soy";
	}
	
	@Override
	public double getCost() {
		return this.getBeverage()
		           .getCost() + .15;
	}
}
