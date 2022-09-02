package command.remoteloader.command.light;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.Light;

public class LightOnCommand implements Command {
	
	private final Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
}
