package strategy.simuduck.duck;

import strategy.simuduck.Duck;
import strategy.simuduck.behaviour.fly.FlyWithNoWings;
import strategy.simuduck.behaviour.quack.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		super(new FlyWithNoWings(), new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("A nice rubber duck");
	}
}
