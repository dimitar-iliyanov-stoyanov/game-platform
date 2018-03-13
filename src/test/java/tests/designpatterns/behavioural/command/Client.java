package tests.designpatterns.behavioural.command;

import org.junit.Test;

import designpatterns.behaviour.command.Gamepad;
import designpatterns.behaviour.command.MKCharacter;
import designpatterns.behaviour.command.commands.HighKick;
import designpatterns.behaviour.command.commands.HighPunch;
import designpatterns.behaviour.command.commands.LowKick;
import designpatterns.behaviour.command.commands.LowPunch;

public class Client {

	@Test
	public void testCommand() {
		MKCharacter scorpion = new MKCharacter();

		Gamepad gamepad = new Gamepad.GamepadBuilder().setButtonA(new HighKick(scorpion)).setButtonB(new LowKick(scorpion))
				.setButtonX(new HighPunch(scorpion)).setButtonY(new LowPunch(scorpion)).build();

		gamepad.pressButtonA();
		gamepad.pressButtonB();
		gamepad.pressButtonY();
		gamepad.pressButtonX();
		gamepad.pressButtonY();
		gamepad.showHistory();
	}

}