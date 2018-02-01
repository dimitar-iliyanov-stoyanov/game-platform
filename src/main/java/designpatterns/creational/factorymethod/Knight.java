package designpatterns.creational.factorymethod;

public abstract class Knight {

	private Weapon weapon;
	private Mount mount;

	public Knight() {
		weapon = arm();
		mount = mount();
	}

	protected abstract Weapon arm();

	protected abstract Mount mount();

	@Override
	public String toString() {
		return "Knight with " + weapon + " riding " + mount;
	}

}