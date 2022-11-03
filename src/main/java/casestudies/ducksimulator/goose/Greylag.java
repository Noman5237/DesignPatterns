package casestudies.ducksimulator.goose;

import casestudies.ducksimulator.behaviour.honk.Honk;

public class Greylag extends Goose {
	
	public Greylag() {
		super(new Honk());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Greylag Goose!");
	}
}
