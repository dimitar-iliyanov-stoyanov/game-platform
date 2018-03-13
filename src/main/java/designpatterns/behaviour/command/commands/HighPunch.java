package designpatterns.behaviour.command.commands;

import designpatterns.behaviour.command.MKCharacter;

public class HighPunch extends Command {

	public HighPunch(MKCharacter character) {
		super(character);
	}

	@Override
	public void execute() {
		getCharacter().highPunch();
	}

	@Override
	public void commandDetails() {
		System.out.println("High Punch command");
	}

}