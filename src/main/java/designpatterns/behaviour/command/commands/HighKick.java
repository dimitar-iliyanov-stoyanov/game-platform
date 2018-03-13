package designpatterns.behaviour.command.commands;

import designpatterns.behaviour.command.MKCharacter;

public class HighKick extends Command {

	public HighKick(MKCharacter character) {
		super(character);
	}

	@Override
	public void execute() {
		getCharacter().highKick();
	}

	@Override
	public void commandDetails() {
		System.out.println("High Kick command");
	}

}