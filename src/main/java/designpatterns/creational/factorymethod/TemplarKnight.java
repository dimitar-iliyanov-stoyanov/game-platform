package designpatterns.creational.factorymethod;

public class TemplarKnight extends Knight {

	@Override
	protected Weapon arm() {
		return Weapon.SPEAR;
	}

	@Override
	protected Mount mount() {
		return Mount.HORSE;
	}

}