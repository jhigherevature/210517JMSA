package iteration;

import java.util.Iterator;

public class IterableNodeStack implements Iterable<Node> {
	private Node top;
	/*
	 * Used to track which node is 'next' 
	 * in the iterator
	 */
	private Node cursor;
	
	public void push(int element) {
		Node node = new Node(element);
		push(node);
	}
	
	public void push(Node node) {
		node.setNext(top);
		this.top = (node);
		this.cursor = top;
	}
	
	public Node pop() {
		Node poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	public Node peek() {
		return top;
	}
	
	@Override
	public Iterator<Node> iterator() {
		return new NodeIterator();
	}
	
	/*
	 * 'NodeIterator' is a nested class, i.e. a class created
	 * within another. A class is simply a template to create
	 * objects. Nested classes allow you to consolidate more 
	 * complex objects within the scope of where that object
	 * would be used. In this case, this class will control
	 * how we 'move through' a Node Stack, the example we
	 * previously examined.
	 */
	private class NodeIterator implements Iterator<Node> {
		NodeIterator() {
			cursor = top;
		}
		
		/*
		 * hasNext is a method from the Iterator interface
		 */
		@Override
		public boolean hasNext() {
			if (cursor != null)
				return true;
			
			return false;
		}

		/*
		 * next is a method from the Iterator interface
		 */
		@Override
		public Node next() {
			Node ret = cursor;
			if (cursor != null)
				cursor = ret.getNext();
			
			return ret;
		}
	}
}
