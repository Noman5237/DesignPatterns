package adapter.enumiter;

import java.util.Enumeration;
import java.util.Iterator;

public class EIAdapter <T> implements Enumeration<T>, Iterator<T> {
	
	private final Enumeration<T> enumeration;
	
	public EIAdapter(Enumeration<T> enumeration) {
		this.enumeration = enumeration;
	}
	
	public EIAdapter(Iterator<T> iterator) {
		this.enumeration = new IteratorEnumeration<>(iterator);
	}
	
	@Override
	public boolean hasMoreElements() {
		return enumeration.hasMoreElements();
	}
	
	@Override
	public T nextElement() {
		return enumeration.nextElement();
	}
	
	@Override
	public boolean hasNext() {
		return hasMoreElements();
	}
	
	@Override
	public T next() {
		return nextElement();
	}
}
