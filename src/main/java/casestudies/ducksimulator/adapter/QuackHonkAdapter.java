package casestudies.ducksimulator.adapter;

import casestudies.ducksimulator.behaviour.honk.HonkBehaviour;
import casestudies.ducksimulator.behaviour.quack.QuackBehaviour;
import lombok.Getter;

@Getter
public class QuackHonkAdapter implements QuackBehaviour, HonkBehaviour {
	
	private final HonkBehaviour honkBehaviour;
	private final QuackBehaviour quackBehaviour;
	
	public QuackHonkAdapter(HonkBehaviour honkBehaviour) {
		this.honkBehaviour = honkBehaviour;
		this.quackBehaviour = honkBehaviour::act;
	}
	
	public QuackHonkAdapter(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
		this.honkBehaviour = quackBehaviour::act;
	}
	
	@Override
	public void act() {
		honkBehaviour.act();
	}
}
