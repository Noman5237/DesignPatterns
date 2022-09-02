package command.remoteloader;

import command.remoteloader.command.garagedoor.GarageDoorOpenCommand;
import command.remoteloader.command.light.LightOnCommand;
import command.remoteloader.receiver.GarageDoor;
import command.remoteloader.receiver.Light;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		remote.setCommand(new GarageDoorOpenCommand(garageDoor));
		remote.buttonWasPressed();
	}
}
