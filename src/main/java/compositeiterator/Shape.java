package compositeiterator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Shape {
	private String name;
	
	void draw() {
		System.out.println("Drawing " + name);
	}
}
