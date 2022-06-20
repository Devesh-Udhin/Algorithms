public class Node {
	private int element;
	private Node next;	// points to the successor node
	
	public Node(int element){
		this.element = element;
		this.next = null;
	}
	
	public int getElement(){
		return element;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setElement(int newElement){
		element  = newElement;
	}
	
	public void setNext(Node newNode){
		next = newNode;
	}
	
	public String toString(){
		return Integer.toString(element);
	}
} // end class Node