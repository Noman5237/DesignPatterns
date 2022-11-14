package casestudies.ducksimulator.adapter;

import casestudies.ducksimulator.behaviour.quack.QuackBehaviour;
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
	public QuackBehaviour getQuackBehaviour() {
		return new QuackHonkAdapter(goose.getHonkBehaviour());
	}
	
	@Override
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		try {
			QuackHonkAdapter quackHonkAdapter = (QuackHonkAdapter) quackBehaviour;
			goose.setHonkBehaviour(quackHonkAdapter.getHonkBehaviour());
		} catch (ClassCastException exception) {
			throw new IllegalArgumentException("goose can only honk", exception);
		}
	}
}
