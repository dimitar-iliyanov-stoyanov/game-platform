package designpatterns.creational.simplefactory.impl;

import designpatterns.creational.simplefactory.Mount;

final class TemplarKnight extends AbstractKnight {

	TemplarKnight(String name, Weapon weapon, Mount mount) {
		super(name, weapon, mount);
	}

	@Override
	public void fight() {
		System.out.println("Templar Knight named: " + getName() + " and fighting with " + getWeapon().toString() + " on " + getMount());
	}

}