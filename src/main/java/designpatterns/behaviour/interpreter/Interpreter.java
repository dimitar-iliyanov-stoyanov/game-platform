package designpatterns.behaviour.interpreter;

import java.util.Stack;

public class Interpreter {

	private Stack<Expression> expression = new Stack<>();

	public void addOperand(int value) {
		expression.push(new MyNumber(value));
	}

	public void addOperation(String operation) {
		if (operation.equals("+")) {
			expression.push(new Plus(expression.pop(), expression.pop()));
		}
	}

	public int getResult() {
		return expression.pop().interpret();
	}

}