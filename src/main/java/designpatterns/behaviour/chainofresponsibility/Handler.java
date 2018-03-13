package designpatterns.behaviour.chainofresponsibility;

public abstract class Handler {

	private Handler handler;

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	protected abstract String gerResource();

	public void handleRequest(String string) {
		if (gerResource().equals(string)) {
			System.out.println("Request handled");
		} else {
			System.out.println("Dispatching request to next handler:");
			if (handler != null) {
				handler.handleRequest(string);
			} else {
				System.out.println("No next handler in line. Request not handled!");
			}
		}
	}

}