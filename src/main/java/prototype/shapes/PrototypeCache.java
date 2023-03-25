package prototype.shapes;

import lombok.Getter;
import prototype.shapes.player.Mario;
import prototype.shapes.player.Player;
import prototype.shapes.shape.Square;

public enum PrototypeCache {
	RED_SQUARE(new Square(1, 1, "red")),
	SUPER_MARIO(new Mario()),
	YELLOW_SQUARE(new Square(1, 1, "yellow")),
	ZELDA(new Player("Zelda", 100));
	
	@Getter
	private final Prototype prototype;
	
	PrototypeCache(Prototype prototype) {
		this.prototype = prototype;
	}
	
	public static Prototype get(PrototypeCache prototypeCache) {
		return prototypeCache.prototype.copy();
	}
}
