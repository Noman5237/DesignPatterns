package prototype.shapes.shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import prototype.shapes.Prototype;

@Data
@AllArgsConstructor
public class Shape implements Prototype {
	
	private int x;
	private int y;
	private String color;
	
	@Override
	public Prototype copy() {
		return new Shape(x, y, color);
	}
}
