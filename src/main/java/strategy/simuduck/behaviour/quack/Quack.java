package strategy.simuduck.behaviour.quack;

public class Quack implements QuackBehaviour {
	
	@Override
	public void act() {
		System.out.println("Quack...Quack...Quack...");
	}
}
