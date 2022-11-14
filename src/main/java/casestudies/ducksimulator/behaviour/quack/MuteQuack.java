package casestudies.ducksimulator.behaviour.quack;

public class MuteQuack implements QuackBehaviour {
	
	@Override
	public void act() {
		System.out.println("(Mute)");
	}
}
