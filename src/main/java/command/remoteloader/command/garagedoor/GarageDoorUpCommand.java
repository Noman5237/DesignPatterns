package command.remoteloader.command.garagedoor;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {
	
	private final GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.up();
	}
}
