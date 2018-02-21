package designpatterns.structural.bridge;

public class MountedKnight extends Knight {

	public MountedKnight(Character character) {
		super(character);
	}

	@Override
	public String toString() {
		return super.toString() + " as a MountedKnight";
	}

}