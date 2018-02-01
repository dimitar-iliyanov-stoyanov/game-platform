package designpatterns.creational.simplefactory.impl;

import designpatterns.creational.simplefactory.Knight;
import designpatterns.creational.simplefactory.Mount;

abstract class AbstractKnight implements Knight {

	private String name;
	private Weapon weapon;
	private Mount mount;

	AbstractKnight(String name, Weapon weapon, Mount mount) {
		this.name = name;
		this.weapon = weapon;
		this.mount = mount;
	}

	String getName() {
		return name;
	}

	Weapon getWeapon() {
		return weapon;
	}

	Mount getMount() {
		return mount;
	}

}