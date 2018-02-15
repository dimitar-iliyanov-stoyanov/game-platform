package tests.designpatterns.creational.singleton;

import org.junit.Test;

import designpatterns.creational.singleton.King;

public class Client {

	@Test
	public void testSingleton() {
		King.getInstance().doSomething();
	}

}