package tests.designpatterns.creational.abstractfactory;

import org.junit.Test;

import designpatterns.creational.abstractfactory.AbstractFactory;
import designpatterns.creational.abstractfactory.ArmyFactory;

public class Client {

	@Test
	public void testAbstractFactory() {
		ArmyFactory factory = AbstractFactory.getFactory(20);
		System.out.println(factory.getUnit().getDamage());

		factory = AbstractFactory.getFactory(100);
		System.out.println(factory.getUnit().getDamage());
	}

}