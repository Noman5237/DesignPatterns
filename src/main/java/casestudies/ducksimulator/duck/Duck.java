package casestudies.ducksimulator.duck;

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
}
