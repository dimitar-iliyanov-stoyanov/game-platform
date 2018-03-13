package designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();
	private int largestBid;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void bid(int amount) {
		if (amount > largestBid) {
			largestBid = amount;
			for (Observer observer : observers) {
				observer.update(largestBid);
			}
		}
	}

}