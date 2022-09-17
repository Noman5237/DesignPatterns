package command.remoteloader;

import command.remoteloader.command.Command;
import command.remoteloader.command.NoCommand;

import java.util.Arrays;

public class RemoteControl {
	
	private final Command[] onCommands;
	private final Command[] offCommands;
	
	public RemoteControl(int noOfSlots) {
		onCommands = new Command[noOfSlots];
		offCommands = new Command[noOfSlots];
		
		Command noCommand = new NoCommand();
		
		for (int i = 0; i < noOfSlots; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	@Override
	public String toString() {
		return "RemoteControl{" +
				"onCommands=" + Arrays.toString(onCommands) +
				", offCommands=" + Arrays.toString(offCommands) +
				'}';
	}
}
