package designpatterns.creational.abstractfactory;

class KnightFactory implements ArmyFactory {

	@Override
	public Unit getUnit() {
		return new Knight();
	}

}