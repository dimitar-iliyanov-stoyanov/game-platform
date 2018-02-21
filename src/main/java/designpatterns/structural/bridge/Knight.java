package designpatterns.structural.bridge;

public abstract class Knight {

	private Character character;

	public Knight(Character character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Having " + character.getClass();
	}

}