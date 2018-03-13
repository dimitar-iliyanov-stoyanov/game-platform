package designpatterns.behaviour.mediator;

public abstract class Unit {

	private General general;

	public Unit(General general) {
		this.general = general;
		general.addUnit(this);
	}

	public void startAttack() {
		general.attack(this);
	}

	public void stopAttack() {
		general.stopAttack(this);
	}

}