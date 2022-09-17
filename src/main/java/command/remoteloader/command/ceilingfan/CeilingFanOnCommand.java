package command.remoteloader.command.ceilingfan;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.CeilingFan;
import command.remoteloader.receiver.CeilingFan.STATES;

public class CeilingFanOnCommand implements Command {
	
	private final CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		if (ceilingFan.getSpeed() == STATES.OFF) {
			ceilingFan.low();
		} else if (ceilingFan.getSpeed() == STATES.LOW) {
			ceilingFan.medium();
		} else if (ceilingFan.getSpeed() == STATES.MEDIUM) {
			ceilingFan.high();
		} else if (ceilingFan.getSpeed() == STATES.HIGH) {
			ceilingFan.low();
		}
	}
	
}
