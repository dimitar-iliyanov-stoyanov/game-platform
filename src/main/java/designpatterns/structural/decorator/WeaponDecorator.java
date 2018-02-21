package designpatterns.structural.decorator;

public abstract class WeaponDecorator implements Weapon {

	private Weapon decoratedWeapon;

	public WeaponDecorator(Weapon decoratedWeapon) {
		this.decoratedWeapon = decoratedWeapon;
	}

	public int cost() {
		return decoratedWeapon.cost();
	}

}