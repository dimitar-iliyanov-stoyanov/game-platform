package designpatterns.behaviour.state;

public class Computer {

	private ComputerState computerState = new BootingState();

	public void processData() {
		computerState.processData(this);
	}

	public void setState(ComputerState computerState) {
		this.computerState = computerState;
	}

}