package casestudies.ducksimulator.behaviour.honk;

public class Honk implements HonkBehaviour {
	
	@Override
	public void act() {
		System.out.println("Honk! Honk! Honk!");
	}
}
