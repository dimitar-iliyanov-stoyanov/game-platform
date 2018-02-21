package designpatterns.structural.decorator;

public class WithScope extends WeaponDecorator {

	public WithScope(Weapon weapon) {
		super(weapon);
	}

	public int cost() {
		return 100 + super.cost();
	}

}