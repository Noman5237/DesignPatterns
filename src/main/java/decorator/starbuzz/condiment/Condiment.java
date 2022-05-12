package decorator.starbuzz.condiment;

import decorator.starbuzz.beverage.Beverage;
import lombok.Getter;

public abstract class Condiment extends Beverage {
	
	@Getter
	private final Beverage beverage;
	
	protected Condiment(Beverage beverage) {
		this.beverage = beverage;
	}
}
