package tests.designpatterns.behavioural.mediator;

import org.junit.Test;

import designpatterns.behaviour.mediator.Footman;
import designpatterns.behaviour.mediator.General;
import designpatterns.behaviour.mediator.Knight;
import designpatterns.behaviour.mediator.Unit;

public class Client {

	@Test
	public void testMediator() {
		General general = new General();

		/** Without Mediator */
		Unit swordman = new Footman(general);
		Unit swordmasters = new Footman(general);
		Unit squires = new Knight(general);
		Unit knights = new Knight(general);

		/**
		if (!swordman.isAttacking() && !swordmasters.isAttacking() && !squires.isAttacking() && !knights.isAttacking()) {
			swordman.startAttack();
		} else {
			System.out.println("Can not attack, some units are already attacking!");
		}

		if (!swordman.isAttacking() && !swordmasters.isAttacking() && !squires.isAttacking() && !knights.isAttacking()) {
			knights.startAttack();
		} else {
			System.out.println("Can not attack, some units are already attacking!");
		}
		swordman.stopAttack();
		*/

		/** With Mediator */
		swordman.startAttack();
		swordmasters.startAttack();
		swordman.stopAttack();
		squires.startAttack();
		knights.startAttack();
		squires.stopAttack();
		knights.startAttack();
		
	}

}