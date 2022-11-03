package casestudies.ducksimulator.behaviour.quack;

import strategy.simuduck.behaviour.quack.QuackBehaviour;

public class Quack implements QuackBehaviour {
	
	@Override
	public void quack() {
		System.out.println("Quack...Quack...Quack...");
	}
}
