package designpatterns.creational.staticfactorymethodcopy;

import java.util.Arrays;
import java.util.List;

public class MasterBlacksmith extends Blacksmith {

	@Override
	protected List<Weapon> makeWeapons() {
		return Arrays.asList(Weapon.SWORD, Weapon.SPEAR);
	}

}