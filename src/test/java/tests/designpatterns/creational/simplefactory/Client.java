package tests.designpatterns.creational.simplefactory;

import org.junit.Test;

import designpatterns.creational.simplefactory.Knight;
import designpatterns.creational.simplefactory.impl.KnightFactory;

public class Client {

	@Test
	public void test() {
		Knight dragonKnight = KnightFactory.getDragonKnight();
		dragonKnight.fight();

		Knight templarKnight = KnightFactory.getTemplarKnight();
		templarKnight.fight();
	}

}