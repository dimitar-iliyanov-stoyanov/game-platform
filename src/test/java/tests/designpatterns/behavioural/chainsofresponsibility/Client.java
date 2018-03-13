package tests.designpatterns.behavioural.chainsofresponsibility;

import org.junit.Test;

import designpatterns.behaviour.chainofresponsibility.Handler;
import designpatterns.behaviour.chainofresponsibility.Invoker;
import designpatterns.behaviour.chainofresponsibility.Receiver1;
import designpatterns.behaviour.chainofresponsibility.Receiver2;
import designpatterns.behaviour.chainofresponsibility.Receiver3;

public class Client {

	@Test
	public void testChainsOfResponsibility() {
		Handler receiver1 = new Receiver1();
		Handler receiver2 = new Receiver2();
		Handler receiver3 = new Receiver3();
		receiver1.setHandler(receiver2);
		receiver2.setHandler(receiver3);

		Invoker invoker = new Invoker(receiver1);
		invoker.handleRequest("Receiver1");
		System.out.println();
		invoker.handleRequest("Receiver2");
		System.out.println();
		invoker.handleRequest("Receiver3");
		System.out.println();
		invoker.handleRequest("Receiver4");
	}

}