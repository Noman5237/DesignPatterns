package casestudies.ducksimulator.duck.decorator;

import casestudies.ducksimulator.duck.Duck;
import casestudies.ducksimulator.util.Counter;

import java.util.Hashtable;

public class QuackCounter extends Duck {
	
	private static final Hashtable<Duck, Counter> quackCounters;
	
	private final Duck duck;
	private final Counter quackCounter;
	
	static {
		quackCounters = new Hashtable<>();
	}
	
	public QuackCounter(Duck duck) {
		this.duck = duck;
		this.quackCounter = new Counter();
		quackCounters.put(this, this.quackCounter);
	}
	
	@Override
	public void quack() {
		duck.quack();
		quackCounter.increment();
	}
	
	@Override
	public void display() {
		duck.display();
	}
	
	public static int getNumberOfQuacks(Duck duck) {
		try {
			return quackCounters.get(duck)
			                    .getCount();
		} catch (NullPointerException exception) {
			throw new IllegalArgumentException("duck is not being tracked", exception);
		}
	}
}
