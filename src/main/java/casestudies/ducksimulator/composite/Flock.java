package casestudies.ducksimulator.composite;

import java.util.ArrayList;
import java.util.List;

public class Flock <T> {
	
	private final List<T> birds;
	
	public Flock() {
		birds = new ArrayList<>();
	}
	
	public void add(T bird) {
		birds.add(bird);
	}
	
	public void remove(T bird) {
		birds.remove(bird);
	}
	
	public void doTask(Task<T> task) {
		birds.forEach(task::execute);
	}
	
}
