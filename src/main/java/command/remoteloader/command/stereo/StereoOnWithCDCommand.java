package command.remoteloader.command.stereo;

import command.remoteloader.command.Command;
import command.remoteloader.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {
	
	private final Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}
