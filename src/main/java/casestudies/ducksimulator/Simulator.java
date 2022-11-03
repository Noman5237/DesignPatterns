package casestudies.ducksimulator;

import casestudies.ducksimulator.behaviour.honk.Hiss;
import casestudies.ducksimulator.duck.MallardDuck;
import casestudies.ducksimulator.goose.Greylag;

public class Simulator {
	
	public static void main(String[] args) {
		
		MallardDuck mallardDuck = new MallardDuck();
		Greylag greylag = new Greylag();
		
//		DuckGooseAdapter grelagduck = new DuckGooseAdapter(greylag);
//		grelagduck.quack();
//		grelagduck.display();
//		grelagduck.setQuackBehaviour(new Hiss());
	}
	
}
