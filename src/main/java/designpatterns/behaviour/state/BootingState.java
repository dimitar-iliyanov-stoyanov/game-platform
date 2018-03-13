package designpatterns.behaviour.state;

public class BootingState implements ComputerState {

	@Override
	public void processData(Computer computer) {
		System.out.println("The computer is booting.");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		computer.setState(new IdleState());
	}

}