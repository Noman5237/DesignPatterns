package strategy.simuduck;

public class SimUDuck {
	
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		System.out.println("=== Mallard Duck ===");
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		
		RubberDuck rubberDuck = new RubberDuck();
		System.out.println("=== Rubber Duck ===");
		rubberDuck.quack();
		rubberDuck.swim();
		rubberDuck.display();
		
		DecoyDuck decoyDuck = new DecoyDuck();
		System.out.println("=== Decoy Duck ===");
		decoyDuck.quack();
		decoyDuck.swim();
		decoyDuck.display();
		
		ReadHeadDuck readHeadDuck = new ReadHeadDuck();
		System.out.println("=== Read Head Duck ===");
		readHeadDuck.quack();
		readHeadDuck.swim();
		readHeadDuck.display();
	}
}
