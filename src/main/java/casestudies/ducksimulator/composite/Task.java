package casestudies.ducksimulator.composite;

@FunctionalInterface
public interface Task <T> {
	
	void execute(T t);
}
