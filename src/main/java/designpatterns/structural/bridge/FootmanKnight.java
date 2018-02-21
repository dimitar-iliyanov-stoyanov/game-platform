package designpatterns.structural.bridge;

public class FootmanKnight extends Knight {

	public FootmanKnight(Character character) {
		super(character);
	}

	@Override
	public String toString() {
		return super.toString() + " as a FootmanKnight";
	}
}