package designpatterns.creational.prototype;

public class Knight implements Prototype {

	@Override
	public Prototype clone() {
		return new Knight();
	}

	@Override
	public void printStuff() {
		System.out.println("Knight object");
	}

}