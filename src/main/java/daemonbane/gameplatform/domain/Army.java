package daemonbane.gameplatform.domain;

public class Army {

	private int damage;
	private int units;

	public Army(int damage, int units) {
		this.damage = damage;
		this.units = units;
	}

	public int getDamage() {
		return damage;
	}

	public int getUnits() {
		return units;
	}

}