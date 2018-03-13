package tests.designpatterns.structural.composite;

import org.junit.Test;

import designpatterns.structural.composite.Weapon;
import designpatterns.structural.composite.WeaponRack;

public class Client {

	@Test
	public void testComposite() {
		WeaponRack armory = new WeaponRack(); 

		WeaponRack swords = new WeaponRack();
		Weapon longsword = new Weapon();
		swords.addWeapon(longsword);

		WeaponRack swordsHilts = new WeaponRack();
		Weapon heronHilt = new Weapon();
		swordsHilts.addWeapon(heronHilt);
		swords.addWeapon(swordsHilts);

		WeaponRack axes = new WeaponRack();
		Weapon broadaxe = new Weapon();
		axes.addWeapon(broadaxe);

		armory.addWeapon(swords);
		armory.addWeapon(axes);

		armory.showWeapons();
	}

}