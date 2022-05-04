package strategy.simuduck;

import strategy.simuduck.behaviour.fly.FlyRocketPowered;
import strategy.simuduck.duck.*;

public class SimUDuck {
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		System.out.println("=== Mallard Duck ===");
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.fly();
		mallardDuck.display();
		
		Duck rubberDuck = new RubberDuck();
		System.out.println("=== Rubber Duck ===");
		rubberDuck.quack();
		rubberDuck.swim();
		rubberDuck.fly();
		rubberDuck.display();
		
		Duck decoyDuck = new DecoyDuck();
		System.out.println("=== Decoy Duck ===");
		decoyDuck.quack();
		decoyDuck.swim();
		decoyDuck.fly();
		decoyDuck.display();
		
		Duck readHeadDuck = new ReadHeadDuck();
		System.out.println("=== Read Head Duck ===");
		readHeadDuck.quack();
		readHeadDuck.swim();
		readHeadDuck.fly();
		readHeadDuck.display();
		
		Duck modelDuck = new ModelDuck();
		System.out.println("=== Model Duck ===");
		modelDuck.quack();
		modelDuck.swim();
		modelDuck.fly();
		modelDuck.display();
		System.out.println("Adding rocket powered flight capability to model duck");
		modelDuck.setFlyBehaviour(new FlyRocketPowered());
		modelDuck.fly();
	}
}
