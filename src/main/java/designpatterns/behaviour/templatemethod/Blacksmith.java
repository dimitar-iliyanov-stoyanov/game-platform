package designpatterns.behaviour.templatemethod;

import java.util.List;

public abstract class Blacksmith {

	private List<Weapon> weapons;

	public List<Weapon> provideWeapons() {
		weapons = makeWeapons();

		return weapons;
	}

	protected abstract List<Weapon> makeWeapons();

}