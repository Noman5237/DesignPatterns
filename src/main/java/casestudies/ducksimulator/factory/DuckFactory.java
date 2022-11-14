package casestudies.ducksimulator.factory;

import casestudies.ducksimulator.duck.Duck;

public interface DuckFactory {
	
	Duck createDuck(Class<? extends Duck> duckClass, Object... params);
	
}
