package strategy.simuduck.behaviour.fly;

public class FlyWithNoWings implements FlyBehaviour {
	
	@Override
	public void fly() {
		System.out.println("I can't fly :(");
	}
}
