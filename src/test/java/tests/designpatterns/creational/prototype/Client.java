package tests.designpatterns.creational.prototype;

import org.junit.Test;

import designpatterns.creational.prototype.Knight;
import designpatterns.creational.prototype.Prototype;

public class Client {

	@Test
	public void testPrototype() {
		Prototype suppliedPrototype = new Knight();

		Prototype myPrototype = suppliedPrototype.clone();
		myPrototype.printStuff();
	}

}