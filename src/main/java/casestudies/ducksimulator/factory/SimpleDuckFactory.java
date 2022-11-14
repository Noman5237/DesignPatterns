package casestudies.ducksimulator.factory;

import casestudies.ducksimulator.duck.Duck;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class SimpleDuckFactory implements DuckFactory {
	
	@Override
	public Duck createDuck(Class<? extends Duck> duckClass, Object... params) {
		
		Class<?>[] parameterTypes = Arrays.stream(params)
		                                  .map(Object::getClass)
		                                  .toArray(Class[]::new);
		var constructors = duckClass.getConstructors();
		try {
			Constructor<?> requiredConstructor = Arrays.stream(constructors)
			                                           .filter(constructor -> constructor.getParameterCount() == params.length)
			                                           .filter(constructor -> {
				                                           var cParameterTypes = constructor.getParameterTypes();
				                                           for (int i = 0; i < cParameterTypes.length; i++) {
					                                           if (!cParameterTypes[i].isAssignableFrom(parameterTypes[i])) {
						                                           return false;
					                                           }
				                                           }
				                                           return true;
			                                           })
			                                           .findFirst()
			                                           .orElseThrow();
			return (Duck) requiredConstructor.newInstance(params);
		} catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchElementException e) {
			throw new IllegalArgumentException("only simple duck creation supported", e);
		}
	}
}
