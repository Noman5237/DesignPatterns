package strategy.simuduck.duck;

import strategy.simuduck.Duck;
import strategy.simuduck.behaviour.fly.FlyWithWings;
import strategy.simuduck.behaviour.quack.Quack;

public class ReadHeadDuck extends Duck {
	
	public ReadHeadDuck() {
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("A beautiful read head duck");
	}
}
