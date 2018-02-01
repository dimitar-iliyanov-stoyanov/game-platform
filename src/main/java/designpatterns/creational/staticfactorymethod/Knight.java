package designpatterns.creational.staticfactorymethod;

public abstract class Knight {

	public static Knight getDragonKnight() {
		return new DragonKnight();
	}

}