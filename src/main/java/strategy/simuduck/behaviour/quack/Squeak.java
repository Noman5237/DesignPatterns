package strategy.simuduck.behaviour.quack;

public class Squeak implements QuackBehaviour {
	
	@Override
	public void quack() {
		System.out.println("Squeak...Squeak...Squeak...");
	}
}
