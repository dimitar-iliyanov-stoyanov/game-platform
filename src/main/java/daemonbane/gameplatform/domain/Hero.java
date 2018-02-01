package daemonbane.gameplatform.domain;

public class Hero {

	private Weapon weapon;
	private int health;

	public Hero(Weapon weapon, int health) {
		this.weapon = weapon;
		this.health = health;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public int getHealth() {
		return health;
	}

}