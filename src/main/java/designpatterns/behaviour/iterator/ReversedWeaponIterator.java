package designpatterns.behaviour.iterator;

import java.util.List;

public class ReversedWeaponIterator implements WeaponIterator {

	private List<Weapon> weapons;
	private int position;

	public ReversedWeaponIterator(List<Weapon> weapons) {
		this.weapons = weapons;
		position = weapons.size() - 1;
	}

	@Override
	public Weapon getNext() {
		return weapons.get(position--);
	}

	@Override
	public boolean hasNext() {
		return position >= 0;
	}

}