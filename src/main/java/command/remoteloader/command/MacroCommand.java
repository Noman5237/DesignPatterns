package command.remoteloader.command;

import command.remoteloader.command.Command;

public class MacroCommand implements Command {
	
	private final Command[] commands;
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}
}
