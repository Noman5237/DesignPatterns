package compositeiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas implements Iterator<Shape> {
	private final ArrayList<Shape> shapes = new ArrayList<>();
	private Iterator<Shape> shapeIterator;
	
	public Canvas() {
		shapeIterator = shapes.iterator();
	}
	
	public void add(Shape shape) {
		shapes.add(shape);
		shapeIterator = shapes.iterator();
	}
	
	@Override
	public boolean hasNext() {
		return shapeIterator.hasNext();
	}
	
	@Override
	public Shape next() {
		return shapeIterator.next();
	}
	
	public void draw() {
		while (hasNext()) {
			next().draw();
		}
	}
}
