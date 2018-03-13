package designpatterns.behaviour.mediator;

public class Footman extends Unit {

	public Footman(General general) {
		super(general);
	}

	@Override
	public String toString() {
		return "Footman Unit";
	}

}