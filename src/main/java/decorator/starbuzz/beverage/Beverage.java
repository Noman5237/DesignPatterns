package decorator.starbuzz.beverage;

public abstract class Beverage {
	
	abstract public String getDescription();
	
	public abstract double getCost();
	
	public String toString() {
		return String.format("%s - $%.2f", getDescription(), getCost());
	}
}
