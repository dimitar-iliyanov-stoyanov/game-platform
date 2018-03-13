package designpatterns.behaviour.observer;

public class Observer {

	public void update(int bid) {
		System.out.println("Observer updated. Largest amount is now: " + bid);
	}

}