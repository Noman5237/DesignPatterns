package strategy.simuduck.duck;

import strategy.simuduck.Duck;
import strategy.simuduck.behaviour.fly.FlyWithWings;
import strategy.simuduck.behaviour.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("A beautiful mallard duck");
	}
}
