package casestudies.ducksimulator.util;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counter {
	
	private int count;
	
	public void increment() {
		count++;
	}
}
