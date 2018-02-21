package designpatterns.structural.decorator;

public class WithSilencer extends WeaponDecorator {

	public WithSilencer(Weapon weapon) {
		super(weapon);
	}

	public int cost() {
		return 25 + super.cost();
	}

}