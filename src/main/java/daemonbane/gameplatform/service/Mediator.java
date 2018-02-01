package daemonbane.gameplatform.service;

import daemonbane.gameplatform.domain.Army;
import daemonbane.gameplatform.domain.Hero;

public class Mediator {

	private static class Dice {

		private static int sides = 6;

		public static int roll() {
			return (int)(Math.random() * 10) % sides + 1;
		}

	}

	public static void battle(Hero hero, Army army) {
		for (int i = 1; i <= army.getUnits(); ++i) {
			System.out.println("Round #" + i + " of " + army.getUnits());

			int heroRoll = Dice.roll();
			System.out.println("Hero's roll: " + heroRoll);

			int armyUnitRoll = Dice.roll();
			System.out.println("Unit's roll: " + armyUnitRoll);

			if (heroRoll + 1 >= armyUnitRoll) {
				
			}
		}

		System.out.println("Battle ends");
	}

}