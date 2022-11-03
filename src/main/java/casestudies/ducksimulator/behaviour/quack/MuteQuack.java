package casestudies.ducksimulator.behaviour.quack;

import strategy.simuduck.behaviour.quack.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
	
	@Override
	public void quack() {
		System.out.println("(Mute)");
	}
}
