package designpatterns.behaviour.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car {

	List<CarElement> elements = new ArrayList<>();

	public Car() {
		elements.add(new Wheel());
		elements.add(new Wheel());
		elements.add(new Wheel());
		elements.add(new Wheel());
	}

	public void accept(CarElementVisitor visitor) {
		for (CarElement element : elements) {
			element.accept(visitor);
		}
	}

}