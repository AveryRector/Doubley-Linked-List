
public class Node<E> {

	//Instance Variables
		private E element;
		private Node<E> next;
		private Node<E> previous;
		//Parameterized Constructor
		public Node(E anElement, Node<E> previousNode, Node<E> nextNode) {
			element = anElement;
			next = nextNode;
			previous = previousNode;
		}
		//Getters and setters
		public E getElement() {
			return element;
		}
		
		public void setElement(E anElement) {
			element = anElement;
		}
		
		public Node<E> getNextNode(){
			return next;
		}
		
		public void setNextNode(Node<E> nextNode) {
			next = nextNode;
		}
		
		public Node<E> getPreviousNode(){
			return previous;
		}
		
		public void setPreviousNode(Node<E> nextNode) {
			previous = nextNode;
		}
		
		public String toString() {
			return element.toString();
		}
		
	
}