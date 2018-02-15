package designpatterns.creational.abstractfactory;

class FootmanFactory implements ArmyFactory {

	@Override
	public Unit getUnit() {
		return new Footman();
	}

}