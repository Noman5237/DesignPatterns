package casestudies.ducksimulator.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class Subject <T> {
	
	private final T subject;
	private final HashMap<Enum<?>, List<Observer>> observers;
	
	public Subject(T subject, Enum<?>... events) {
		this.subject = subject;
		this.observers = new HashMap<>();
		Arrays.asList(events)
		      .forEach(event -> observers.put(event, new ArrayList<>()));
	}
	
	public Observer add(Observer observer, Enum<?>... events) {
		try {
			Arrays.stream(events)
			      .forEach(event -> observers.get(event)
			                                 .add(observer));
		} catch (NullPointerException e) {
			throw new IllegalArgumentException("Invalid event");
		}
		
		return observer;
	}
	
	public void remove(Observer observer, Enum<?>... events) {
		try {
			Arrays.asList(events)
			      .forEach(event -> observers.get(event)
			                                 .remove(observer));
		} catch (NullPointerException e) {
			System.out.println("Observer not found");
		}
	}
	
	public void notifyObservers(Enum<?>... events) {
		Arrays.asList(events)
		      .forEach(event -> observers.getOrDefault(event, new ArrayList<>())
		                                 .forEach(observer -> observer.update(event)));
	}
	
	public void call(Consumer<T> function, Enum<?>... events) {
		function.accept(subject);
		notifyObservers(events);
	}
}
