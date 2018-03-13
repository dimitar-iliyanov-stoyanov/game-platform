package designpatterns.behaviour.command;

/* Receiver */
public class MKCharacter {

	public void highPunch() {
		System.out.println("Attack with high punch.");
	}

	public void lowPunch() {
		System.out.println("Attack with low punch.");
	}

	public void highKick() {
		System.out.println("Attack with high kick.");
	}

	public void lowKick() {
		System.out.println("Attack with low kick.");
	}

}