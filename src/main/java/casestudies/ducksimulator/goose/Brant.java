package casestudies.ducksimulator.goose;

import casestudies.ducksimulator.behaviour.honk.Honk;

public class Brant extends Goose {
	
	public Brant() {
		super(new Honk());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Brant Goose!");
	}
}
