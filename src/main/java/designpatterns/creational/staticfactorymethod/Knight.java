package designpatterns.creational.staticfactorymethod;

public abstract class Knight {

	public static Knight getInstance() {
		return new DragonKnight();
	}

}