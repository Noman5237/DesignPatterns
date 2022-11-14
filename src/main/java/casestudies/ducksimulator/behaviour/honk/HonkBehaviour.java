package casestudies.ducksimulator.behaviour.honk;

import casestudies.ducksimulator.behaviour.Behaviour;

@FunctionalInterface
public interface HonkBehaviour extends Behaviour {
	
	void act();
	
}
