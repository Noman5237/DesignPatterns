package casestudies.ducksimulator.factory;

import casestudies.ducksimulator.duck.Duck;
import casestudies.ducksimulator.duck.decorator.QuackCounter;

public class CountingDuckFactory implements DuckFactory {
	
	@Override
	public Duck createDuck(Object... params) {
		if (params.length < 1) {
			throw new IllegalArgumentException("provide duck class to create duck");
		}
		
		Duck duck;
		try {
			duck = (Duck) params[0];
		} catch (ClassCastException exception) {
			throw new IllegalArgumentException("only ducks can be created", exception);
		}
		
		return new QuackCounter(duck);
	}
}
