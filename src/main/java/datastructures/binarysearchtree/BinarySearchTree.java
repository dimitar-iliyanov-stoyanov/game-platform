package datastructures.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

	private static class BSTNode {
		int data;
		BSTNode leftNode;
		BSTNode rightNode;

		BSTNode(int data) {
			this.data = data;
		}

		void insert(int data) {
			if (data < this.data) {
				if (leftNode == null) {
					leftNode = new BSTNode(data);
				} else {
					leftNode.insert(data);
				}
			} else {
				if (rightNode == null) {
					rightNode = new BSTNode(data);
				} else {
					rightNode.insert(data);
				}
			}
		}

		void depthFirstInOrderTraversal() {
			if (leftNode != null) {
				leftNode.depthFirstInOrderTraversal();
			}

			System.out.println(data);

			if (rightNode != null) {
				rightNode.depthFirstInOrderTraversal();
			}
		}

		void depthFIrstPreOrderTraversal() {
			System.out.println(data);

			if (leftNode != null) {
				leftNode.depthFIrstPreOrderTraversal();
			}

			if (rightNode != null) {
				rightNode.depthFIrstPreOrderTraversal();
			}
		}

		void depthFirstPostOrderTraversal() {
			if (leftNode != null) {
				leftNode.depthFirstPostOrderTraversal();
			}

			if (rightNode != null) {
				rightNode.depthFirstPostOrderTraversal();
			}

			System.out.println();
		}

		void breadthFirstTraversal() {
			Queue<BSTNode> nodes = new LinkedList<>();
			nodes.add(this);

			while (!nodes.isEmpty()) {
				BSTNode node = nodes.poll();
				System.out.print(node.data + " ");

				if (node.leftNode != null) {
					nodes.add(node.leftNode);
				}
				if (node.rightNode != null) {
					nodes.add(node.rightNode);
				}
			}
		}

		// To rewrite it iteratively
		void delete(BSTNode parent, int data) {
			if (this.data == data) {
				if (leftNode == null && rightNode == null) {
					parent = null;
					System.out.println("Here");
				}
				
				
			} else if (data < this.data) {
				if (leftNode != null) {
					leftNode.delete(this, data);
				} else {
					System.out.println("Can't delete. Element not found.");
				}
			} else {
				if (rightNode != null) {
					rightNode.delete(this, data);
				} else {
					System.out.println("Can't delete. Element not found.");
				}
			}
		}

		void search(int data) {
			if (getNodeByData(data) != null) {
				System.out.println(data + " Found");
			} else {
				System.out.println(data + " Not Found");
			}
		}

		// Rewrite this using Null Object Pattern
		// RE-Think all methods in terms of SOLID
		BSTNode getNodeByData(int data) {
			if (this.data == data) {
				return this;
			}

			if (data < this.data) {
				if (leftNode == null) {
					return null;
				} else {
					return leftNode.getNodeByData(data);
				}
			} else {
				if (rightNode == null) {
					return null;
				} else {
					return rightNode.getNodeByData(data);
				}
			}
		}

	}

	private BSTNode rootNode;

	public void insert(int key) {
		if (rootNode == null) {
			rootNode = new BSTNode(key);
		} else {
			rootNode.insert(key);
		}
	}

	public void depthFirstInOrderTraversal() {
		rootNode.depthFirstInOrderTraversal();
	}

	public void depthFirstPreOrderTraversal() {
		rootNode.depthFIrstPreOrderTraversal();
	}

	public void depthFirstPostOrderTraversal() {
		rootNode.depthFirstPostOrderTraversal();
	}

	public void breadthFirstTraversal() {
		rootNode.breadthFirstTraversal();
	}

	public void delete(int data) {
		rootNode.delete(null, data);
	}

	public void search(int data) {
		rootNode.search(data);
	}

}