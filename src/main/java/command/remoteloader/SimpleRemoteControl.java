package command.remoteloader;

import command.remoteloader.command.Command;

public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl() {
	}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
