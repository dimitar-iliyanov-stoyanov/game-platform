package tests.designpatterns.behavioural.iterator;

import org.junit.Test;

import designpatterns.behaviour.iterator.Weapon;
import designpatterns.behaviour.iterator.WeaponCollection;
import designpatterns.behaviour.iterator.WeaponIterator;

public class Client {

	@Test
	public void testIterator() {
		WeaponCollection collection = new WeaponCollection();
		collection.addWeapon(new Weapon("sword"));
		collection.addWeapon(new Weapon("axe"));
		collection.addWeapon(new Weapon("spear"));

		WeaponIterator iterator = collection.getWeaponIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}

		iterator = collection.getReversedWeaponIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}
	}

}