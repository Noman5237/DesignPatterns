package strategy.simuduck;

public class RubberDuck extends Duck {
	
	@Override
	void quack() {
		System.out.println("Squeak...Squeak...Squeak...");
	}
	
	@Override
	void display() {
		System.out.println("A nice rubber duck");
	}
}
