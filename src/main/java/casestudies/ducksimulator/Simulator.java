package casestudies.ducksimulator;

import casestudies.ducksimulator.adapter.DuckGooseAdapter;
import casestudies.ducksimulator.adapter.QuackHonkAdapter;
import casestudies.ducksimulator.behaviour.honk.Hiss;
import casestudies.ducksimulator.behaviour.quack.MuteQuack;
import casestudies.ducksimulator.composite.Composite;
import casestudies.ducksimulator.duck.Duck;
import casestudies.ducksimulator.duck.MallardDuck;
import casestudies.ducksimulator.duck.RubberDuck;
import casestudies.ducksimulator.duck.decorator.QuackCounter;
import casestudies.ducksimulator.factory.DuckFactory;
import casestudies.ducksimulator.factory.SimpleDuckFactory;
import casestudies.ducksimulator.goose.Greylag;
import casestudies.ducksimulator.duck.ReadHeadDuck;
import casestudies.ducksimulator.observer.Observer;
import casestudies.ducksimulator.observer.Subject;

public class Simulator {
	
	enum DuckEvents {QUACK}
	
	public static void main(String[] args) {
		
		System.out.println(" ================================ Task 1 ==================================== ");
		
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.quack();
		mallardDuck.setQuackBehaviour(new MuteQuack());
		mallardDuck.quack();
		
		System.out.println(" ================================ Task 2 ==================================== ");
		
		Greylag greylag = new Greylag();
		Duck greylagDuck = new DuckGooseAdapter(greylag);
		greylagDuck.display();
		greylagDuck.quack();
		greylagDuck.setQuackBehaviour(new QuackHonkAdapter(new Hiss()));
		greylagDuck.quack();
		
		System.out.println(" ================================ Task 3 ==================================== ");
		
		Duck rubberDuck = new QuackCounter(new RubberDuck());
		rubberDuck.display();
		rubberDuck.quack();
		rubberDuck.quack();
		rubberDuck.quack();
		
		System.out.println("No of quacks: " + QuackCounter.getNumberOfQuacks(rubberDuck));
		
		System.out.println(" ================================ Task 4 ==================================== ");
		
		DuckFactory simpleDuckFactory = new SimpleDuckFactory();
		Duck redHeadDuck = simpleDuckFactory.createDuck(ReadHeadDuck.class);
		redHeadDuck.display();
		redHeadDuck.quack();
		
		Duck countingRedHeadDuck = simpleDuckFactory.createDuck(QuackCounter.class, redHeadDuck);
		countingRedHeadDuck.display();
		countingRedHeadDuck.quack();
		countingRedHeadDuck.quack();
		countingRedHeadDuck.quack();
		countingRedHeadDuck.quack();
		System.out.println("No of quack: " + QuackCounter.getNumberOfQuacks(countingRedHeadDuck));
		
		System.out.println(" ================================ Task 5 ==================================== ");
		
		Composite<Duck> flock = new Composite<>();
		flock.add(redHeadDuck);
		flock.add(countingRedHeadDuck);
		flock.add(rubberDuck);
		flock.add(mallardDuck);
		flock.add(greylagDuck);
		
		flock.accept(Duck::display);
		flock.accept(Duck::quack);
		
		int noOfDucks = flock.getObjects()
		                     .reduce(0, (count, duck) -> count + 1, Integer::sum);
		System.out.println("No of ducks: " + noOfDucks);
		
		System.out.println(" ================================ Task 6 ==================================== ");
		
		Subject<Duck> redHeadDuckSubject = new Subject<>(redHeadDuck,
		                                                 DuckEvents.QUACK);
		final int[] count = {0};
		var quackCounterObserver = redHeadDuckSubject.add(
				event -> {
					count[0]++;
					System.out.println("Observer 1: " + count[0]);
				}, DuckEvents.QUACK);
		
		redHeadDuckSubject.add(
				(event) -> System.out.println("Observer 2: " + event.name()),
				DuckEvents.QUACK);
		
		redHeadDuckSubject.call(Duck::quack, DuckEvents.QUACK);
		redHeadDuckSubject.call(Duck::quack, DuckEvents.QUACK);
		
		redHeadDuckSubject.remove(quackCounterObserver, DuckEvents.QUACK);
		
		redHeadDuckSubject.call(duck -> System.out.println("Manual Quack"),
		                        DuckEvents.QUACK);
		redHeadDuckSubject.call(Duck::display);
	}
	
}
