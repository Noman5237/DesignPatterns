package casestudies.cpuscheduling.scheduler;

import casestudies.cpuscheduling.Process;

import java.util.ArrayList;
import java.util.List;

public class PreemptiveSJF implements Scheduler {
	
	private final List<Process> processes;
	private Process currentProcess;
	
	public PreemptiveSJF() {
		processes = new ArrayList<>();
	}
	
	@Override
	public void addProcess(Process process) {
		process.setArrivalTime(System.currentTimeMillis());
		System.out.println("Process " + process.getName() + " added at time " + process.getArrivalTime() / 1000L);
		processes.add(process);
	}
	
	public void run() {
		System.out.println("Running Preemptive SJF");
	}
}
