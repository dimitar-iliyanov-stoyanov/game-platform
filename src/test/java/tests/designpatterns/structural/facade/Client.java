package tests.designpatterns.structural.facade;

import org.junit.Test;

import designpatterns.structural.facade.ComputerFacade;

public class Client {

	@Test
	public void testFacade() {
		ComputerFacade computer = new ComputerFacade();
		computer.startComputer();
	}
}