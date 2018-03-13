package tests.designpatterns.behavioural.state;

import org.junit.Test;

import designpatterns.behaviour.state.Computer;

public class Client {

	@Test
	public void testState() {
		Computer computer = new Computer();

		computer.processData();
		computer.processData();
	}

}