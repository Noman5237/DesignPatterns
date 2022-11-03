package casestudies.ducksimulator.duck.decorator;

import casestudies.ducksimulator.duck.Duck;

public class QuackCounter extends Duck {
	
	private static int numberOfQuacks;
	
	private final Duck duck;
	
	public QuackCounter(Duck duck) {
		this.duck = duck;
	}
	
	@Override
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
	
	@Override
	public void display() {
		duck.display();
	}
	
	public int getNumberOfQuacks() {
		return numberOfQuacks;
	}
	
}
