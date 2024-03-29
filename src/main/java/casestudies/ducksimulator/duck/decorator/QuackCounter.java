package casestudies.ducksimulator.duck.decorator;

import casestudies.ducksimulator.behaviour.quack.QuackBehaviour;
import casestudies.ducksimulator.duck.Duck;
import casestudies.ducksimulator.util.Counter;

import java.util.Hashtable;

public class QuackCounter extends Duck {
	
	private static final Hashtable<Integer, Counter> quackCounters;
	
	private final Duck duck;
	private final Counter quackCounter;
	
	static {
		quackCounters = new Hashtable<>();
	}
	
	public QuackCounter(Duck duck) {
		this.duck = duck;
		this.quackCounter = new Counter();
		quackCounters.put(this.hashCode(), this.quackCounter);
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
			return quackCounters.get(duck.hashCode())
			                    .getCount();
		} catch (NullPointerException exception) {
			throw new IllegalArgumentException("duck is not being tracked", exception);
		}
	}
	
	@Override
	public QuackBehaviour getQuackBehaviour() {
		return duck.getQuackBehaviour();
	}
	
	@Override
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		duck.setQuackBehaviour(quackBehaviour);
	}
}
