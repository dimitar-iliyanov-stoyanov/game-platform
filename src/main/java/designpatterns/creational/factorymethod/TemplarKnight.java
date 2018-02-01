package designpatterns.creational.factorymethod;

public class TemplarKnight extends Knight {

	@Override
	protected Mount mount() {
		return new Horse();
	}

}