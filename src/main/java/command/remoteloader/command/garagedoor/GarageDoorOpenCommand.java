package command.remoteloader.command.garagedoor;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
	
	private final GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	
	@Override
	public void execute() {
		garageDoor.up();
	}
}
