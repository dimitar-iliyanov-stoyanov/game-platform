package designpatterns.behaviour.interpreter;

class MyNumber implements Expression {

	int number;

	public MyNumber(int number) {
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}

}