package datastructures.binarysearchtree;

import org.junit.Test;

public class Client {

	@Test
	public void testBinarySearchTree() {
		BST bst = new BST();
		bst.insert(10);
		bst.insert(5);
		bst.insert(4);
		bst.insert(8);
		bst.insert(6);
		bst.insert(9);
		bst.insert(15);
		bst.insert(13);
		bst.insert(12);
		bst.insert(11);
		bst.insert(20);
		bst.insert(16);
		bst.insert(17);
		bst.insert(19);
		bst.insert(24);
		bst.insert(27);
//		bst.insert(8);
//		bst.insert(2);
//		bst.insert(1);
//		bst.insert(8);
//		bst.insert(5);
//		bst.insert(3);
//		bst.insert(8);
//		bst.insert(1);
//		bst.insert(4);
//		bst.insert(6);
//		bst.insert(9);
//		bst.insert(7);
//		bst.traversal();

//		System.out.println(bst.search(2));
//		System.out.println(bst.search(3));
//		System.out.println(bst.search(4));
//		System.out.println(bst.search(14));

//		bst.traversal();
//		bst.delete(5);
//		bst.traversal();

		BSTIterator iterator = bst.getDepthFirstInOrderTraversalIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.getNext());
		}
	}

}