package casestudies.ducksimulator.duck;


import casestudies.ducksimulator.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super(new MuteQuack());
	}
	
	@Override
	public void display() {
		System.out.println("Shh...I am a decoy");
	}
}
