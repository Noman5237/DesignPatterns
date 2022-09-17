package command.remoteloader.command.hottub;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.HotTub;

public class HotTubOnCommand implements Command {
	
	private final HotTub hottub;
	
	public HotTubOnCommand(HotTub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
