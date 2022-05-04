package strategy.simuduck.duck;

import strategy.simuduck.Duck;
import strategy.simuduck.behaviour.fly.FlyWithNoWings;
import strategy.simuduck.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super(new FlyWithNoWings(), new MuteQuack());
	}
	
	@Override
	public void display() {
		System.out.println("Shh...I am a decoy");
	}
}
