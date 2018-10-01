
public abstract class LabTemplate<E> {

	protected Node<E> head;
	protected Node<E> tail;
	protected int size;
		
	//Getter methods
	//Get the size of the linked list
	public abstract int getSize();
	//Return a boolean indicating if the linked list is empty or not 
	public abstract boolean isEmpty();
	//Return the element in the first node of the linked list
	public abstract E getFirst();
	//Return the element in the last node of the linked list
	public abstract E getLast();
	//Get the element at a specific node in the linked list. If the specified node does not exist, throw a new IndexOutOfBoundsException
	public abstract E getElementAt(int index) throws IndexOutOfBoundsException;
	
	public Node<E> getHeadNode(){
		return head;
	}
	
	//Setter methods
	//No need to implement this methods but feel free if you want the extra challenge 
	//public abstract void addElementAt(int index, E anElement);
	//public abstract E removeElementAt(int index);
	
	//Add a new node to the start of the linked list. You must update the head instance variable and make sure your new node both has the 
	//value provided by the method parameter and is properly linked to other nodes. You must also increment the size instance variable by 1
	public abstract void addFirst(E anElement);
	//Same as add first except we add to the tail of the linked list
	public abstract void addLast(E anElement);
	//Remove the last element in the LinkedList. Make sure to update the head instance variable, decrement the size instance variable by 1, 
	//return the element of the removed node, and have the nodes remaining in the linked list linked to the correct locations
	public abstract E removeFirst();
	//Same as removeFirst except we remove the last element of the linked list
	public abstract E removeLast();
		
}