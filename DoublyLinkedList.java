
public class DoublyLinkedList<E> extends LabTemplate<E> {
	
	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		if(size == 0) { // if size is 0 list is empty
			return true;
		}
		else {
			return false;
		}
	}
	
	public E getFirst() {
		if(isEmpty()) { 
			return null;
		}
		else {
			return head.getElement(); // return the head of list (first)
		}
	}
	
	public E getLast() {
		if(isEmpty()) {
			return null;
		}
		else {
			return tail.getElement(); // return tail of list (last)
		}
	}
	
	public E getElementAt(int index) throws IndexOutOfBoundsException {
		if(index >= size) { // index looking for cannot be larger than size of list
			throw new IndexOutOfBoundsException();
		}
		else {
			Node<E> currentNode = head; // new node that is equal to the head
			
			for(int i  = 0; i < index; i++) { // loop through list till reaching index desired 
				currentNode = currentNode.getNextNode();
			}
			return currentNode.getElement(); // return element 
		}
	}
	
	public void addFirst(E anElement) {
		head = new Node<E>(anElement, null, head); // create new node with reference to the head of list
		
		if(isEmpty() == true) { // head and tail will be equal, if the element added is the only element 
			head = tail;
		}
		
		size++; // size of list increases
	}
	
	public void addLast(E anElement) {
		tail = new Node<E>(anElement, tail, null); // create new node with reference to tail
		
		if(isEmpty() == true) {
			tail = head;  
		}
		
		size++;
	}
	
	
}
