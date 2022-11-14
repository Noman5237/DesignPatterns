package casestudies.ducksimulator.behaviour.quack;

import casestudies.ducksimulator.behaviour.Behaviour;

@FunctionalInterface
public interface QuackBehaviour extends Behaviour {
	
	void act();
}
