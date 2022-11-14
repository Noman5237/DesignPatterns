package casestudies.ducksimulator.factory;

import casestudies.ducksimulator.duck.Duck;

import java.lang.reflect.InvocationTargetException;

public class SimpleDuckFactory implements DuckFactory {
	
	@Override
	public Duck createDuck(Object... params) {
		
		if (params.length < 1) {
			throw new IllegalArgumentException("provide duck class to create duck");
		}
		
		Class<? extends Duck> duckClass;
		try {
			
			duckClass = (Class<? extends Duck>) params[0];
			
		} catch (ClassCastException exception) {
			throw new IllegalArgumentException("only ducks can be created", exception);
		}
		
		try {
			return duckClass.getDeclaredConstructor()
			                .newInstance();
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			throw new IllegalArgumentException("only simple duck creation supported", e);
		}
	}
	
	
}
