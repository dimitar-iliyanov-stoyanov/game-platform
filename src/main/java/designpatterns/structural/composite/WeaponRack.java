package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WeaponRack implements WeaponComposite {

	private List<WeaponComposite> weapons = new ArrayList<>();

	public void addWeapon(WeaponComposite weapon) {
		weapons.add(weapon);
	}

	public void removeWeapon(WeaponComposite weapon) {
		weapons.remove(weapon);
	}

	@Override
	public void checkWeapon() {
		System.out.println("Weapon rack");
		
		for (WeaponComposite weapon : weapons) {
			weapon.checkWeapon();
		}
	}

	public void showWeapons() {
		for (WeaponComposite weapon : weapons) {
			weapon.checkWeapon();
		}
	}

}