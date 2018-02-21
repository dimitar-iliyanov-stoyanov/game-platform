package tests.designpatterns.structural.decorator;

import org.junit.Test;

import designpatterns.structural.decorator.AssaultRifle;
import designpatterns.structural.decorator.Weapon;
import designpatterns.structural.decorator.WeaponDecorator;
import designpatterns.structural.decorator.WithScope;
import designpatterns.structural.decorator.WithSilencer;

public class Client {

	@Test
	public void testDecorator() {
		Weapon assaultRifle = new AssaultRifle();
		System.out.println(assaultRifle.cost());

		WeaponDecorator decoratedAssaultRifle = new WithSilencer(assaultRifle);
		System.out.println(decoratedAssaultRifle.cost());

		decoratedAssaultRifle = new WithScope(decoratedAssaultRifle);
		System.out.println(decoratedAssaultRifle.cost());

		decoratedAssaultRifle = new WithScope(decoratedAssaultRifle);
		System.out.println(decoratedAssaultRifle.cost());
	}

}