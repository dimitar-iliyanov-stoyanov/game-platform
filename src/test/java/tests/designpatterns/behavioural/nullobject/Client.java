package tests.designpatterns.behavioural.nullobject;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import designpatterns.behaviour.nullobject.Animal;
import designpatterns.behaviour.nullobject.Cat;
import designpatterns.behaviour.nullobject.NullAnimal;

public class Client {

	@Test
	public void testNullObject() {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Cat());
		animals.add(new Cat());
		animals.add(new NullAnimal());

		for (Animal animal : animals) {
			animal.makeSound();
		}
	}

}