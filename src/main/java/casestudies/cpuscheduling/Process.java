package casestudies.cpuscheduling;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Process {
	
	public Process(String name, int burstTime, int priority) {
		this.name = name;
		this.burstTime = burstTime;
		this.priority = priority;
	}
	
	private final String name;
	private int burstTime;
	private int priority;
	private long arrivalTime;
	private int waitingTime;
	
	public void start() {
		System.out.println("Process " + name + " started");
	}
	
	public void end() {
		System.out.println("Process " + name + " ended");
	}
	
}
