package command.remoteloader.command.light;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.Light;

public class LightOnCommand implements Command {
	
	private final Light light;
	private boolean isOn;
	
	public LightOnCommand(Light light) {
		this.light = light;
		this.isOn = false;
	}
	
	@Override
	public void execute() {
		if (!isOn) {
			light.on();
			isOn = true;
		}
	}
	
	public void undo() {
		light.off();
	}
}
