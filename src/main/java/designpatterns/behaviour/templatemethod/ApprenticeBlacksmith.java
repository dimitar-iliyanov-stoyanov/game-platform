package designpatterns.behaviour.templatemethod;

import java.util.Arrays;
import java.util.List;

public class ApprenticeBlacksmith extends Blacksmith {

	@Override
	protected List<Weapon> makeWeapons() {
		return Arrays.asList(Weapon.AXE);
	}

}