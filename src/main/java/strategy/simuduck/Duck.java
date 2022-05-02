package strategy.simuduck;

public abstract class Duck {
	
	void quack() {
		System.out.println("Quack...Quack...Quack...");
	}
	
	void swim() {
		System.out.println("Swimming...");
	}
	
	abstract void display();
}
