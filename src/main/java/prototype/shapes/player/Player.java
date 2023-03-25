package prototype.shapes.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import prototype.shapes.Prototype;

@Data
@AllArgsConstructor
public class Player implements Prototype {
	
	private String name;
	private int hp;
	
	@Override
	public Prototype copy() {
		return new Player(name, hp);
	}
}
