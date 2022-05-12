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
		Beverage beverage = this.getBeverage();
		double cost = beverage.getCost();
		
		switch (beverage.getSize()) {
			case SMALL:
				cost += .15;
				break;
			case MEDIUM:
				cost += .20;
				break;
			case LARGE:
				cost += .25;
				break;
		}
		
		return cost;
	}
}
