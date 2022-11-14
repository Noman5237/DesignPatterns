package casestudies.ducksimulator.adapter;

import casestudies.ducksimulator.behaviour.Behaviour;
import casestudies.ducksimulator.duck.Duck;
import casestudies.ducksimulator.goose.Goose;

public class DuckGooseAdapter extends Duck {
	
	private final Goose goose;
	
	public DuckGooseAdapter(Goose goose) {
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
	}
	
	@Override
	public void display() {
		goose.display();
	}
	
	@Override
	public Behaviour getQuackBehaviour() {
		return goose.getHonkBehaviour();
	}
	
	@Override
	public void setQuackBehaviour(Behaviour quackBehaviour) {
		goose.setHonkBehaviour(quackBehaviour);
	}
}
