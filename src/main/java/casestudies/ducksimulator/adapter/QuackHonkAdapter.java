package casestudies.ducksimulator.adapter;

import casestudies.ducksimulator.behaviour.honk.HonkBehaviour;
import casestudies.ducksimulator.behaviour.quack.QuackBehaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class QuackHonkAdapter implements QuackBehaviour {
	
	private final HonkBehaviour honkBehaviour;
	
	@Override
	public void act() {
		honkBehaviour.act();
	}
}
