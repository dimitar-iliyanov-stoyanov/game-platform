package designpatterns.behaviour.visitor;

public class Wheel implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}

}