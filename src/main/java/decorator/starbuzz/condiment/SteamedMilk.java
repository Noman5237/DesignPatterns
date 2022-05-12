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
		Beverage beverage = this.getBeverage();
		double cost = beverage.getCost();
		
		switch (beverage.getSize()) {
			case SMALL:
				cost += .05;
				break;
			case MEDIUM:
				cost += .10;
				break;
			case LARGE:
				cost += .15;
				break;
		}
		
		return cost;
	}
}
