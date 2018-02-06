package designpatterns.creational.singleton;

public class King {

	private static King instance;

	private King() {}

	public static King getInstance() {
		if (instance == null) {
			instance = new King();
		}

		return instance; 
	}

}