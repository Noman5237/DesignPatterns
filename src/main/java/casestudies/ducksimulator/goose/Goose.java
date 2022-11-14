package casestudies.ducksimulator.goose;

import casestudies.ducksimulator.behaviour.Behaviour;
import casestudies.ducksimulator.behaviour.honk.HonkBehaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Goose implements Honk {
	
	private HonkBehaviour honkBehaviour;
	
	@Override
	public void honk() {
		honkBehaviour.act();
	}
	
	public abstract void display();
	
	public Behaviour getHonkBehaviour() {
		return honkBehaviour;
	}
	
	public void setHonkBehaviour(Behaviour honkBehaviour) {
		try {
			
			this.honkBehaviour = (HonkBehaviour) honkBehaviour;
		} catch (ClassCastException exception) {
			throw new IllegalArgumentException("goose can only honk", exception);
		}
	}
}
