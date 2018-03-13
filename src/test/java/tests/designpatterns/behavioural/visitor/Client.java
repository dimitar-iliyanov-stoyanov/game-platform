package tests.designpatterns.behavioural.visitor;

import org.junit.Test;

import designpatterns.behaviour.visitor.Car;
import designpatterns.behaviour.visitor.ElementsOptimizations;
import designpatterns.behaviour.visitor.YearlyTechnicalReview;

public class Client {

	@Test
	public void testVisitor() {
		Car car = new Car();

		car.accept(new YearlyTechnicalReview());
		car.accept(new ElementsOptimizations());
	}

}