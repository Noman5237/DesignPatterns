package command.remoteloader;

import command.remoteloader.command.Command;
import command.remoteloader.command.MacroCommand;
import command.remoteloader.command.ceilingfan.CeilingFanOffCommand;
import command.remoteloader.command.ceilingfan.CeilingFanOnCommand;
import command.remoteloader.command.garagedoor.GarageDoorDownCommand;
import command.remoteloader.command.garagedoor.GarageDoorUpCommand;
import command.remoteloader.command.light.LightOffCommand;
import command.remoteloader.command.light.LightOnCommand;
import command.remoteloader.command.stereo.StereoOffCommand;
import command.remoteloader.command.stereo.StereoOnWithCDCommand;
import command.remoteloader.receiver.CeilingFan;
import command.remoteloader.receiver.GarageDoor;
import command.remoteloader.receiver.Light;
import command.remoteloader.receiver.Stereo;

public class RemoteControlTest {
	
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl(8);
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("Default");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		MacroCommand partyOnMacro = new MacroCommand(new Command[] {livingRoomLightOn, kitchenLightOn, stereoOnWithCDCommand});
		MacroCommand partyOffMacro = new MacroCommand(new Command[] {livingRoomLightOff, kitchenLightOff, stereoOffCommand});
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
		remoteControl.setCommand(3, garageDoorUpCommand, garageDoorDownCommand);
		remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);
		remoteControl.setCommand(5, partyOnMacro, partyOffMacro);
	}
}
