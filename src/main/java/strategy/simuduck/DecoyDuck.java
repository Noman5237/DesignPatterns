package strategy.simuduck;

public class DecoyDuck extends Duck {
	
	@Override
	void quack() {
	}
	
	@Override
	void display() {
		System.out.println("Shh...I am a decoy");
	}
}
