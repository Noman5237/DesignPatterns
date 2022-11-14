package casestudies.ducksimulator.duck;

import casestudies.ducksimulator.behaviour.Behaviour;
import casestudies.ducksimulator.behaviour.quack.QuackBehaviour;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Duck implements Quackable {
	
	private QuackBehaviour quackBehaviour;
	
	public void quack() {
		quackBehaviour.act();
	}
	
	public abstract void display();
	
	public Behaviour getQuackBehaviour() {
		return quackBehaviour;
	}
	
	public void setQuackBehaviour(Behaviour quackBehaviour) {
		try {
			this.quackBehaviour = (QuackBehaviour) quackBehaviour;
		} catch (ClassCastException exception) {
			throw new IllegalArgumentException("duck can only quack", exception);
		}
	}
}
