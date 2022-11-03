package casestudies.ducksimulator.goose;

import casestudies.ducksimulator.behaviour.honk.Bark;

public class Swan extends Goose {
	
	public Swan() {
		super(new Bark());
	}
	
	@Override
	public void display() {
		System.out.println("I'm a Swan Goose!");
	}
}
