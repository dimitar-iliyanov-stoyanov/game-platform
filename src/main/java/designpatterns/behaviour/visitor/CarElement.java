package designpatterns.behaviour.visitor;

public interface CarElement {
	void accept(CarElementVisitor visitor);
}