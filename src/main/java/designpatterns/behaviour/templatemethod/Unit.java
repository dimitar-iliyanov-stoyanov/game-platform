package designpatterns.behaviour.templatemethod;

public abstract class Unit {

	public void weaponize() {
		System.out.println("Weaponizing unit with " + getWeapon());
	}

	public abstract String getWeapon();

}