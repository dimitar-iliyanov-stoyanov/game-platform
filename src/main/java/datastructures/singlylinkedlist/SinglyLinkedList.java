package datastructures.singlylinkedlist;

public class SinglyLinkedList {

	private static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	private Node root;

	public void add(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
			return;
		}

		Node node = root;
		while (node.next != null) {
			node = node.next;
		}
		node.next = newNode;
	}

	public void add(int value, int index) {
		
	}

	public int get() {
		Node node = root;
		while (node.next != null) {
			node = node.next;
		}

		return node.data;
	}

	public int get(int index) {
		return 0;
	}

	public void set(int valuie, int index) {
		
	}

	public void remove(int index) {
		
	}

}