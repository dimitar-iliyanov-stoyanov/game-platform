package designpatterns.behaviour.command.commands;

import designpatterns.behaviour.command.MKCharacter;

public class LowPunch extends Command {

	public LowPunch(MKCharacter character) {
		super(character);
	}

	@Override
	public void execute() {
		getCharacter().lowPunch();
	}

	@Override
	public void commandDetails() {
		System.out.println("Low Punch command");
	}

}