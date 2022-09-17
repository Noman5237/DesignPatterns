package command.remoteloader.command.stereo;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.Stereo;

public class StereoOffCommand implements Command {
	
	private final Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.off();
	}
}
