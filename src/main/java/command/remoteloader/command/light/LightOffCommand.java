package command.remoteloader.command.light;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.Light;

public class LightOffCommand implements Command {
	
	private final Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}
	
	public void undo() {
		light.on();
	}
}
