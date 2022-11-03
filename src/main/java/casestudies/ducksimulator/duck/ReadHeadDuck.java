package casestudies.ducksimulator.duck;


import casestudies.ducksimulator.behaviour.quack.Quack;

public class ReadHeadDuck extends Duck {
	
	public ReadHeadDuck() {
		super(new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("A beautiful read head duck");
	}
}
