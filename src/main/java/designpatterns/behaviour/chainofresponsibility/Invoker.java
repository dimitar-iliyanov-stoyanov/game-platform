package designpatterns.behaviour.chainofresponsibility;

public class Invoker {

	private Handler receiver;

	public Invoker(Handler handler) {
		receiver = handler;
	}

	public void handleRequest(String string) {
		receiver.handleRequest(string);
	}

}