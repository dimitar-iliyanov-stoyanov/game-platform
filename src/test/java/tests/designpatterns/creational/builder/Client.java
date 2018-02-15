package tests.designpatterns.creational.builder;

import org.junit.Test;

import designpatterns.creational.builder.Knight;

public class Client {

	@Test
	public void testBuilder() {
		Knight knight = new Knight.KnightBuilder().setDamage(10).build();
		knight.doStuff();
	}

}