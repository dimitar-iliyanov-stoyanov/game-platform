package datastructures.binarysearchtree;

import java.util.Stack;

class DFInOrderBSTIterator implements BSTIterator {

	private Stack<BSTNode> stack = new Stack<>();

	DFInOrderBSTIterator(BSTNode root) {
		pushUpToTheLowestChilder(root);
	}

	@Override
	public boolean hasNext() {
		return !stack.isEmpty();
	}

	@Override
	public int getNext() {
		BSTNode lastNode = stack.pop();
		if (lastNode.rightNode != null) {
			pushUpToTheLowestChilder(lastNode.rightNode);
		}

		return lastNode.data;
	}

	private void pushUpToTheLowestChilder(BSTNode root) {
		stack.push(root);

		BSTNode node = root;
		while (node.leftNode != null) {
			node = node.leftNode;
			stack.push(node);
		}
	}

}