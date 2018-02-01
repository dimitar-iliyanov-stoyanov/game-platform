package designpatterns.creational.factorymethod;

public abstract class Knight {

	private Mount mount;

	public Knight() {
		mount = mount();
	}

	protected abstract Mount mount();

	@Override
	public String toString() {
		return "Knight riding " + mount;
	}

}