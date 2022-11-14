package casestudies.ducksimulator.behaviour.quack;

public class Squeak implements QuackBehaviour {
	
	@Override
	public void act() {
		System.out.println("Squeak...Squeak...Squeak...");
	}
}
