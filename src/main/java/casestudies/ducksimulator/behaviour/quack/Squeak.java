package casestudies.ducksimulator.behaviour.quack;

import strategy.simuduck.behaviour.quack.QuackBehaviour;

public class Squeak implements QuackBehaviour {
	
	@Override
	public void quack() {
		System.out.println("Squeak...Squeak...Squeak...");
	}
}
