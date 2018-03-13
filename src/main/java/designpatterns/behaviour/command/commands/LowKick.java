package designpatterns.behaviour.command.commands;

import designpatterns.behaviour.command.MKCharacter;

public class LowKick extends Command {

	public LowKick(MKCharacter character) {
		super(character);
	}

	@Override
	public void execute() {
		getCharacter().lowKick();
	}

	@Override
	public void commandDetails() {
		System.out.println("Low Kick command");
	}

}