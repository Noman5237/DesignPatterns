package compositeiterator;

public class Main {
	
	public static void main(String[] args) {
		Shape circle = new Circle("Circle");
		Shape rectangle = new Rectangle("Rectangle");
		Shape square = new Square("Square");
		
		Canvas canvas = new Canvas();
		canvas.add(circle);
		canvas.add(rectangle);
		canvas.add(square);
		
		canvas.draw();
	}
	
}
