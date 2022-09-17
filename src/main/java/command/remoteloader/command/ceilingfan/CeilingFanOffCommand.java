package command.remoteloader.command.ceilingfan;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
	
	private final CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}
	
}
