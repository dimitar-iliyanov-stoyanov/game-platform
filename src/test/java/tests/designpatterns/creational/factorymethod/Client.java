package tests.designpatterns.creational.factorymethod;

import org.junit.Test;

import designpatterns.creational.factorymethod.Knight;
import designpatterns.creational.factorymethod.TemplarKnight;

public class Client {

	@Test
	public void test() {
		Knight knight = new TemplarKnight();
		System.out.println(knight);
	}

}