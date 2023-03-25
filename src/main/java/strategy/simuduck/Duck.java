package strategy.simuduck;

import lombok.*;
import strategy.simuduck.behaviour.fly.FlyBehaviour;
import strategy.simuduck.behaviour.quack.QuackBehaviour;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Duck {
	
	private FlyBehaviour flyBehaviour;
	private QuackBehaviour quackBehaviour;
	
	public void quack() {
		quackBehaviour.act();
	}
	
	public void swim() {
		System.out.println("Swimming...");
	}
	
	public void fly() {
		flyBehaviour.fly();
	}
	
	public abstract void display();
}
