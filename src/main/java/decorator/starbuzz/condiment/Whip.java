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
		Beverage beverage = this.getBeverage();
		double cost = beverage.getCost();
		
		switch (beverage.getSize()) {
			case SMALL:
				cost += .08;
				break;
			case MEDIUM:
				cost += .11;
				break;
			case LARGE:
				cost += .16;
				break;
		}
		
		return cost;
	}
}
