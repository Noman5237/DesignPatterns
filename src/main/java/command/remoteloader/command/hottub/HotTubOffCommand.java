package command.remoteloader.command.hottub;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.HotTub;

public class HotTubOffCommand implements Command {
	
	private final HotTub hottub;
	
	public HotTubOffCommand(HotTub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
