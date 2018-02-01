package designpatterns.creational.simplefactory.impl;

import designpatterns.creational.simplefactory.Knight;
import designpatterns.creational.simplefactory.Mount;

public class KnightFactory {

	private KnightFactory() {}

	public static Knight getTemplarKnight() {
		Mount horse = new Horse();
		Knight knight = new TemplarKnight("Lancelot", Weapon.SWORD, horse);

		return knight;
	}

	public static Knight getDragonKnight() {
		return new DragonKnight();
	}

}