package decorator.starbuzz.beverage;

import lombok.Getter;

public abstract class Beverage {
	
	@Getter
	private final Size size;
	
	public Beverage(Size size) {
		this.size = size;
	}
	
	abstract public String getDescription();
	
	public abstract double getCost();
	
	public String toString() {
		return String.format("%s - %s - $%.2f", getDescription(), getSize(), getCost());
	}
}
