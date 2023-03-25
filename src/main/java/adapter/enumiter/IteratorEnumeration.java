package adapter.enumiter;

import java.util.*;

public class IteratorEnumeration <T> implements Enumeration<T> {
	
	Iterator<T> iterator;
	
	public IteratorEnumeration(Iterator<T> iterator) {
		this.iterator = iterator;
	}
	
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
	
	public T nextElement() {
		return iterator.next();
	}
}
