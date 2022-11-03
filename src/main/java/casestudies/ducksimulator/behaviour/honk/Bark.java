package casestudies.ducksimulator.behaviour.honk;

public class Bark implements HonkBehaviour {
	
	@Override
	public void honk() {
		System.out.println("Bark! Bark! Bark!");
	}
}
