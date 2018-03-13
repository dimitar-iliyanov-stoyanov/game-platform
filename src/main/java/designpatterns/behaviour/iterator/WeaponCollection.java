package designpatterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.List;

public class WeaponCollection {

	private List<Weapon> weapons = new ArrayList<>();

	public void addWeapon(Weapon weapon) {
		weapons.add(weapon);
	}

	public void removeWeapon(Weapon weapon) {
		weapons.remove(weapon);
	}

	public WeaponIterator getWeaponIterator() {
		return new WeaponIteratorImpl(weapons);
	}

	public WeaponIterator getReversedWeaponIterator() {
		return new ReversedWeaponIterator(weapons);
	}

}