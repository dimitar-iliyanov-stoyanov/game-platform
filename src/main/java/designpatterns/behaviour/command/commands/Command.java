package designpatterns.behaviour.command.commands;

import designpatterns.behaviour.command.MKCharacter;

public abstract class Command {

	private MKCharacter character;

	public Command(MKCharacter character) {
		this.character = character;
	}

	public abstract void execute();

	public abstract void commandDetails();

	public MKCharacter getCharacter() {
		return character;
	}

}