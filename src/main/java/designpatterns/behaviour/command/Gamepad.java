package designpatterns.behaviour.command;

import java.util.ArrayList;
import java.util.List;

import designpatterns.behaviour.command.commands.Command;

/* Invoker */
public class Gamepad {

	private List<Command> history = new ArrayList<>();
	private Command buttonA;
	private Command buttonB;
	private Command buttonX;
	private Command buttonY;

	private Gamepad(GamepadBuilder builder) {
		buttonA = builder.buttonA;
		buttonB = builder.buttonB;
		buttonX = builder.buttonX;
		buttonY = builder.buttonY;
	}

	public void pressButtonA() {
		buttonA.execute();
		history.add(buttonA);
	}

	public void pressButtonB() {
		buttonB.execute();
		history.add(buttonB);
	}

	public void pressButtonX() {
		buttonX.execute();
		history.add(buttonX);
	}

	public void pressButtonY() {
		buttonY.execute();
		history.add(buttonY);
	}

	public void showHistory() {
		for (Command command : history) {
			command.commandDetails();
		}
	}

	public static class GamepadBuilder {
		private Command buttonA;
		private Command buttonB;
		private Command buttonX;
		private Command buttonY;

		public GamepadBuilder setButtonA(Command commandA) {
			buttonA = commandA;
			return this;
		}

		public GamepadBuilder setButtonB(Command commandB) {
			buttonB = commandB;
			return this;
		}

		public GamepadBuilder setButtonX(Command commandX) {
			buttonX = commandX;
			return this;
		}

		public GamepadBuilder setButtonY(Command commandY) {
			buttonY = commandY;
			return this;
		}

		public Gamepad build() {
			return new Gamepad(this);
		}

	}

}