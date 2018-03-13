package designpatterns.behaviour.iterator;

public class Weapon {

	private String id;

	public Weapon(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id;
	}

}