package datastructures.singlylinkedlist;

import static org.junit.Assert.assertEquals;

import java.util.SortedMap;
import java.util.TreeMap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Client {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

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
		assertEquals(10, sll.get(0));

		sll.add(9, 0);
		assertEquals(9, sll.get(0));
		assertEquals(10, sll.get(1));

		thrown.expect(RuntimeException.class);
		sll.get(2);
	}

	@Test
	public void testSet() {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.add(10);
		assertEquals(10, sll.get());

		sll.set(9, 0);
		assertEquals(9, sll.get());
	}

	@Test
	public void testRemoveLastElem() {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.add(9);
		sll.add(10);
		assertEquals(9, sll.get(0));
		assertEquals(10, sll.get(1));

		sll.remove(1);
		assertEquals(9, sll.get(0));
		thrown.expect(RuntimeException.class);
		assertEquals(10, sll.get(1));
	}

	@Test
	public void testRemoveFirstElem() {
		SinglyLinkedList sll = new SinglyLinkedList();

		sll.add(9);
		sll.add(10);
		assertEquals(9, sll.get(0));
		assertEquals(10, sll.get(1));

		sll.remove(0);
		assertEquals(10, sll.get(0));
		thrown.expect(RuntimeException.class);
		assertEquals(10, sll.get(1));
	}

	@Test
	public void testMap() {
		SortedMap<String, Integer> myMap = new TreeMap<>();
		myMap.put(null, 1);
		myMap.put("John", null);
		
		System.out.println(myMap.get("John"));
		System.out.println(myMap.get(null));
		System.out.println(myMap.firstKey());
	}

}