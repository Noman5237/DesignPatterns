package casestudies.ducksimulator.goose;

import casestudies.ducksimulator.behaviour.honk.Hiss;

public class Snow extends Goose {
	
	public Snow() {
		super(new Hiss());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Snow Goose!");
	}
}
