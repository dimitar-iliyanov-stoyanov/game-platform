package designpatterns.behaviour.visitor;

public class YearlyTechnicalReview implements CarElementVisitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Performing yearly technical review on the wheel.");
	}

}