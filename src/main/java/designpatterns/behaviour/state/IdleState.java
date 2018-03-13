package designpatterns.behaviour.state;

public class IdleState implements ComputerState {

	@Override
	public void processData(Computer computer) {
		System.out.println("Processing data;");
	}

}