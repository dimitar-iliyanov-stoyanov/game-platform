package designpatterns.creational.abstractfactory;

class Knight implements Unit {

	@Override
	public int getDamage() {
		return 3;
	}

	@Override
	public int getHealth() {
		return 10;
	}

}