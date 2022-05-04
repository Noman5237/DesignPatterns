package strategy.simuduck.duck;

import strategy.simuduck.Duck;
import strategy.simuduck.behaviour.fly.FlyWithNoWings;
import strategy.simuduck.behaviour.quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		super(new FlyWithNoWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck");
	}
}
