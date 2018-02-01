package tests.designpatterns.creational.staticfactorymethod;

import org.junit.Test;

import designpatterns.creational.staticfactorymethod.Knight;

public class Client {

	@Test
	public void test() {
		Knight knight = Knight.getDragonKnight();
		System.out.println(knight);
	}

}