package casestudies.ducksimulator.factory;

import java.lang.reflect.InvocationTargetException;

public class DuckFactoryCreator {
	
	public static DuckFactory createDuckFactory(Class<? extends DuckFactory> duckFactoryClass) {
		try {
			return duckFactoryClass.getDeclaredConstructor()
			                       .newInstance();
		} catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
			throw new IllegalArgumentException("only simple duck factory creation supported", e);
		}
	}
}
