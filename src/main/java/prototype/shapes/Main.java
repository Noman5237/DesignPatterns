package prototype.shapes;

import static prototype.shapes.PrototypeCache.*;

public class Main {
	
	public static void main(String[] args) {
		Prototype redSquare = PrototypeCache.get(RED_SQUARE);
		System.out.println(redSquare);
		Prototype redSquareCopy = redSquare.copy();
		System.out.println(redSquare == redSquareCopy ? "" : "They are not the same objects");
		System.out.println(redSquare.equals(redSquareCopy) ? "They are identical" : "");
		
		Prototype superMario = PrototypeCache.get(SUPER_MARIO);
		System.out.println(superMario);
	}
}
