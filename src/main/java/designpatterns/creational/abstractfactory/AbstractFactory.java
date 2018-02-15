package designpatterns.creational.abstractfactory;

public class AbstractFactory {

	private AbstractFactory() {}

	public static ArmyFactory getFactory(int speed) {
		return (speed > 50) ? new KnightFactory() : new FootmanFactory();
	}

}