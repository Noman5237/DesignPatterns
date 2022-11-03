package casestudies.ducksimulator.duck;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import strategy.simuduck.behaviour.quack.QuackBehaviour;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Duck implements Quackable {
	
	private QuackBehaviour quackBehaviour;
	
	public void quack() {
		quackBehaviour.quack();
	}
	
	public abstract void display();
}
