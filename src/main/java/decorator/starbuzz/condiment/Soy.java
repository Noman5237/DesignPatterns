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
		Beverage beverage = this.getBeverage();
		double cost = beverage.getCost();
		
		switch (beverage.getSize()) {
			case SMALL:
				cost += .10;
				break;
			case MEDIUM:
				cost += .15;
				break;
			case LARGE:
				cost += .20;
				break;
		}
		
		return cost;
	}
}
