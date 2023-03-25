package casestudies.cpuscheduling;

import casestudies.cpuscheduling.scheduler.PreemptiveSJF;
import casestudies.cpuscheduling.scheduler.Scheduler;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	
	private static final HashMap<Process, Integer> processes = new HashMap<>() {{
		put(new Process("P1", 10, 3), 3);
		put(new Process("P2", 1, 1), 0);
		put(new Process("P3", 2, 3), 1);
		put(new Process("P4", 7, 4), 4);
		put(new Process("P5", 5, 2), 5);
	}};
	
	public static void main(String[] args) {
		Scheduler preemptiveSJF = new PreemptiveSJF();
		streamProcesses(preemptiveSJF, processes);
	}
	
	public static void streamProcesses(Scheduler scheduler, HashMap<Process, Integer> processes) {
		Stream<Process> sortedProcesses = processes.keySet()
		                                           .stream()
		                                           .sorted(Comparator.comparingInt(processes::get));
		long startTime = System.currentTimeMillis();
		sortedProcesses
				.forEach((process) -> {
					long currentTime = System.currentTimeMillis();
					long needToBeAt = (processes.get(process) * 1000L + startTime);
					long waitingTime = needToBeAt - currentTime;
					try {
						if (waitingTime > 0) {
							Thread.sleep(waitingTime);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					scheduler.addProcess(process);
				});
	}
}
