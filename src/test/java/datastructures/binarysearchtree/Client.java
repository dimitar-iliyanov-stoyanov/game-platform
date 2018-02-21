package datastructures.binarysearchtree;

import org.junit.Test;

public class Client {

	@Test
	public void testBinarySearchTree() {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
//		bst.insert(1);
//		bst.insert(4);
//		bst.insert(6);
//		bst.insert(9);
//		bst.depthFirstInOrderTraversal();
//		bst.breadthFirstTraversal();
//		for (int i = 0; i < 20; ++i) {
//			bst.search(i);
//		}
		bst.delete(3);
		bst.breadthFirstTraversal();
	}

}