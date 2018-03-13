package tests.designpatterns.behavioural.observer;

import org.junit.Test;

import designpatterns.behaviour.observer.Observer;
import designpatterns.behaviour.observer.Subject;

public class Client {

	@Test
	public void testObserver() {
		Subject subject = new Subject();
		subject.addObserver(new Observer());
		subject.addObserver(new Observer());

		subject.bid(4);
		subject.bid(3);
		subject.bid(5);
	}

}