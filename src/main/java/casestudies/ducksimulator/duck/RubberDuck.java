package casestudies.ducksimulator.duck;


import casestudies.ducksimulator.behaviour.quack.Squeak;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		super(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("A nice rubber duck");
	}
}
