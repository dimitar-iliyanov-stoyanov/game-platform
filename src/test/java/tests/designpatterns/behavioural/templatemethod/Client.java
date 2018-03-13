package tests.designpatterns.behavioural.templatemethod;

import org.junit.Test;

import designpatterns.behaviour.templatemethod.Knight;
import designpatterns.behaviour.templatemethod.Unit;

public class Client {

	@Test
	public void testTemplateMethod() {
		Unit knight = new Knight();
		knight.weaponize();
	}

}