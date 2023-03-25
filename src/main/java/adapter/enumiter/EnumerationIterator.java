package adapter.enumiter;

import java.util.*;

public class EnumerationIterator <T> implements Iterator<T> {
	
	private final Enumeration<T> enumeration;
	
	public EnumerationIterator(Enumeration<T> enumeration) {
		this.enumeration = enumeration;
	}
	
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}
	
	public T next() {
		return enumeration.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
