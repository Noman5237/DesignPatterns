package casestudies.ducksimulator.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Composite <T> implements Task<T> {
	
	private final List<T> objects;
	
	public Composite() {
		objects = new ArrayList<>();
	}
	
	public void add(T object) {
		objects.add(object);
	}
	
	public void remove(T object) {
		objects.remove(object);
	}
	
	@Override
	public void accept(Consumer<T> task) {
		getObjects().forEach(task);
	}
	
	public Stream<T> getObjects() {
		return objects.stream();
	}
	
}
