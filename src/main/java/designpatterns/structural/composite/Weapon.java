package designpatterns.structural.composite;

public class Weapon implements WeaponComposite {

	@Override
	public void checkWeapon() {
		System.out.println("Weapon");
	}

}