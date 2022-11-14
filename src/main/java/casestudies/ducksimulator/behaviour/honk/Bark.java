package casestudies.ducksimulator.behaviour.honk;

public class Bark implements HonkBehaviour {
	
	@Override
	public void act() {
		System.out.println("Bark! Bark! Bark!");
	}
}
