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
		Node newNode = new Node(value);

		if (index == 0) {
			newNode.next = root;
			root = newNode;
		} else {
			Node parent = getNode(index - 1);
			newNode.next = parent.next;
			parent.next = newNode;
		}
	}

	public int get() {
		Node node = root;
		while (node.next != null) {
			node = node.next;
		}

		return node.data;
	}

	public int get(int index) {
		return getNode(index).data;
	}

	private Node getNode(int index) {
		if (index == 0) {
			return root;
		}

		Node node = root;

		for (int i = 0; i < index; ++i) {
			if (node.next == null) {
				throw new RuntimeException("Given index is bigger than the size of the list.");
			}
			node = node.next;
		}

		return node;
	}

	public void set(int value, int index) {
		Node node = getNode(index);
		node.data = value;
	}

	public void remove(int index) {
		if (index == 0) {
			root = (root.next != null) ? root.next : null;
			return;
		}

		Node parent = getNode(index - 1);
		Node node = getNode(index);
		parent.next = (node.next != null) ? node.next : null; 
	}

}