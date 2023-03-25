package adapter.enumiter;

import java.util.*;

public class AdapterTestDrive {
	
	public static void main(String[] args) {
		System.out.println("EnumerationIterator");
		Vector<String> v = new Vector<>(Arrays.asList(args));
		Iterator<String> iterator = new EnumerationIterator<>(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("IteratorEnumeration");
		ArrayList<String> l = new ArrayList<>(Arrays.asList(args));
		Enumeration<String> enumeration = new IteratorEnumeration<>(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		System.out.println("EIAdapter Enumeration");
		Enumeration<String> e = new EIAdapter<>(v.iterator());
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("EIAdapter Iterator");
		Iterator<String> i = new EIAdapter<>(v.elements());
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	
}
