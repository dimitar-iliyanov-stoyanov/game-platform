package designpatterns.behaviour.iterator;

import java.util.List;

public class WeaponIteratorImpl implements WeaponIterator {

	private List<Weapon> weapons;
	private int position;

	public WeaponIteratorImpl(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	@Override
	public Weapon getNext() {
		return weapons.get(position++);
	}

	@Override
	public boolean hasNext() {
		return position < weapons.size();
	}

}