package tests.designpatterns.behavioural.interpreter;

import org.junit.Test;

import designpatterns.behaviour.interpreter.Interpreter;

public class Client {

	@Test
	public void testInterpreter() {
		Interpreter interpreter1 = new Interpreter();
		interpreter1.addOperand(4);
		interpreter1.addOperand(5);
		interpreter1.addOperation("+");
		System.out.println(interpreter1.getResult());

		Interpreter interpreter2 = new Interpreter();
		interpreter2.addOperand(4);
		interpreter2.addOperand(5);
		interpreter2.addOperand(1);
		interpreter2.addOperation("+");
		interpreter2.addOperation("+");
		System.out.println(interpreter2.getResult());

		Interpreter interpreter3 = new Interpreter();
		interpreter3.addOperand(1);
		interpreter3.addOperand(2);
		interpreter3.addOperand(3);
		interpreter3.addOperand(4);
		interpreter3.addOperation("+");
		interpreter3.addOperation("+");
		interpreter3.addOperation("+");
		System.out.println(interpreter3.getResult());
	}

}