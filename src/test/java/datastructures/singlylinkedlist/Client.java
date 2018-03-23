package datastructures.singlylinkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Client {

	@Test
	public void testAddAndGet() {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(10);

		assertEquals(10, sll.get());
	}

	@Test
	public void testAddWithIndexAndGetWithIndex() {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add(10);
		sll.add(11);
		sll.add(9, 0);

		assertEquals(9, sll.get(0));
		assertEquals(10, sll.get(1));
		assertEquals(11, sll.get(2));
	}

}