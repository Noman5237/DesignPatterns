package casestudies.ducksimulator.duck;


import casestudies.ducksimulator.behaviour.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		super(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("A beautiful mallard duck");
	}
}
