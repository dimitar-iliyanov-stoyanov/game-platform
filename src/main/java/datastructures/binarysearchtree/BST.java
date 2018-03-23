package datastructures.binarysearchtree;

public class BST {

	private class Traversal {

		void depthFirsthInOrderTraversal(BSTNode node) {
			if (node.leftNode != null) {
				depthFirsthInOrderTraversal(node.leftNode);
			}

			System.out.print(node.data + " ");

			if (node.rightNode != null) {
				depthFirsthInOrderTraversal(node.rightNode);
			}
		}

		void depthFirsthPreOrderTraversal(BSTNode node) {
			System.out.print(node.data + " ");

			if (node.leftNode != null) {
				depthFirsthPreOrderTraversal(node.leftNode);
			}

			if (node.rightNode != null) {
				depthFirsthPreOrderTraversal(node.rightNode);
			}
		}

		void depthFirsthPostOrderTraversal(BSTNode node) {
			if (node.leftNode != null) {
				depthFirsthPostOrderTraversal(node.leftNode);
			}

			if (node.rightNode != null) {
				depthFirsthPostOrderTraversal(node.rightNode);
			}

			System.out.print(node.data + " ");
		}

	}

	private class Searcher {

		boolean search(int data, BSTNode node) {
			if (node == null) {
				return false;
			} else {
				if (data == node.data) {
					return true;
				} else if (data < node.data) {
					return search(data, node.leftNode);
				} else {
					return search(data, node.rightNode);
				}
			}
		}

	}

	private class Inserter {

		BSTNode insert(int data, BSTNode node) {
			if (node == null) {
				node = new BSTNode(data);
			} else {
				if (data < node.data) {
					node.leftNode = insert(data, node.leftNode);
				} else {
					node.rightNode = insert(data, node.rightNode);
				}
			}

			return node;
		}

	}

	private class Deleter {

		BSTNode delete(int data, BSTNode node) {
			if (node.data == data) {
				// Case 1 - Deleting a node with no children: simply remove the node from the tree
				if (node.leftNode == null && node.rightNode == null) {
					return null;
				// Case 3 - Deleting a node with two children: replace the node with it's in-order predecessor(left bottom right),
				// or it's in-order successor(right bottom left)
				} else if (node.leftNode != null && node.rightNode != null) {
					BSTNode predecessor = node.leftNode;
					// Handle case when the parent of the predecessor is not the node to be deleted
					if (predecessor.rightNode != null) {
						BSTNode predecessorParent = node;
						while (predecessor.rightNode != null) {
							predecessorParent = predecessor;
							predecessor = predecessor.rightNode;
						}
						node.data = predecessor.data;
						predecessorParent.rightNode = null;
					} else {
						node.data = predecessor.data;
						node.leftNode = predecessor.leftNode;
					}
				// Case 2 - Deleting a node with one child: remove the node and replace it with its child
				} else if (node.leftNode != null) {
					return node.leftNode;
				// Case 2 - Deleting a node with one child: remove the node and replace it with its child
				} else {
					return node.rightNode;
				}
			} else if (data < node.data) {
				node.leftNode = delete(data, node.leftNode);
			} else {
				node.rightNode = delete(data, node.rightNode);
			}

			return node;
		}

	}

	private BSTNode root;
	private Traversal traversal = new Traversal();
	private Searcher searcher = new Searcher();
	private Inserter inserter = new Inserter();
	private Deleter deleter = new Deleter();

	public void insert(int data) {
		root = inserter.insert(data, root);
	}

	public boolean delete(int data) {
		if (root == null) {
			return false;
		} else if (!search(data)) {
			return false;
		}

		root = deleter.delete(data, root);

		return true;
	}

	public boolean search(int data) {
		return searcher.search(data, root);
	}

	public void traverse() {
		System.out.println("******************** Traversing ********************");
		System.out.print("In order: ");
		traversal.depthFirsthInOrderTraversal(root);
		System.out.println();
		System.out.print("Pre order: ");
		traversal.depthFirsthPreOrderTraversal(root);
		System.out.println();
		System.out.print("Post order: ");
		traversal.depthFirsthPostOrderTraversal(root);
		System.out.println();
	}

	public BSTIterator getDepthFirstInOrderTraversalIterator() {
		return new DFInOrderBSTIterator(root);
	}

}