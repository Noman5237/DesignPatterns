package casestudies.ducksimulator.duck;


import casestudies.ducksimulator.behaviour.quack.Quack;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		super(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck");
	}
}
