package designpatterns.behaviour.visitor;

public class ElementsOptimizations implements CarElementVisitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Performing optimization check on wheel.");
	}

}