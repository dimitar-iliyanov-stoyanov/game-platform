package designpatterns.creational.abstractfactory;

class Footman implements Unit {

	@Override
	public int getDamage() {
		return 4;
	}

	@Override
	public int getHealth() {
		return 40;
	}

}