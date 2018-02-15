package designpatterns.creational.singleton;

public class King {

	private King() {}

	private static class LazyHolder {
		private static final King INSTANCE = new King();
	}

	public static King getInstance() {
		return LazyHolder.INSTANCE; 
	}

	public void doSomething() {
		System.out.println("Singleton doing something!");
	}

}