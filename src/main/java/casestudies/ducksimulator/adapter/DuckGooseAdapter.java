package casestudies.ducksimulator.adapter;

import casestudies.ducksimulator.behaviour.honk.HonkBehaviour;
import casestudies.ducksimulator.duck.Duck;
import casestudies.ducksimulator.goose.Goose;
import strategy.simuduck.behaviour.quack.QuackBehaviour;

class DuckGooseAdapter extends Duck {
	
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
	
	public void setQuackBehaviour(HonkBehaviour honkBehaviour) {
		goose.setHonkBehaviour(honkBehaviour);
	}
	
	public QuackBehaviour getQuackBehaviour() {
		return this::quack;
	}
	
}
