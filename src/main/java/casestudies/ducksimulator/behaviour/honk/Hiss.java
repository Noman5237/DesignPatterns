package casestudies.ducksimulator.behaviour.honk;

public class Hiss implements HonkBehaviour {
	
	@Override
	public void act() {
		System.out.println("Hiss! Hiss! Hiss!");
	}
}
