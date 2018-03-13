package designpatterns.behaviour.mediator;

public class Knight extends Unit {

	public Knight(General general) {
		super(general);
	}

	@Override
	public String toString() {
		return "Knight Unit";
	}

}