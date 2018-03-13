package designpatterns.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

public class General {

	private List<Unit> units = new ArrayList<>();
	private boolean isSomeUnitAttacking;

	public void addUnit(Unit unit) {
		if (!units.contains(unit)) {
			units.add(unit);
		}
	}

	public void attack(Unit unit) {
		if (isSomeUnitAttacking) {
			System.out.println("Can not attack. Some Unit is attacking!");
		} else if (units.contains(unit)) {
			isSomeUnitAttacking = true;
			System.out.println(unit + " is attacking");
		}
	}

	public void stopAttack(Unit unit) {
		if (!isSomeUnitAttacking) {
			System.out.println("Can not stop the attack. No Unit is attacking!");
		} else if (units.contains(unit)) {
			isSomeUnitAttacking = false;
			System.out.println(unit + " is stopping the attack");
		}
	}

}