public class LinkedList {
	protected Node head;
	protected long size;

	public LinkedList() {
		head = null;
		size = 0;
	}

	public Node getHead() {
		return head;
	}

	public long getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void addFirst(int newElement) {
		Node newNode = new Node(newElement);
		newNode.setNext(head);
		head = newNode;
		size++;
	}

	public void addLast(int newElement) {
		Node newNode = new Node(newElement);
		if (head == null)
			head = newNode;
		else {
			Node previous = head;
			while (previous.getNext() != null)
				previous = previous.getNext();
			previous.setNext(newNode);
		}
		size++;
	}

	public void addOrder(int element) {
		Node newNode = new Node(element);

		if (head == null)
			head = newNode; // list is empty
		else if (head.getElement() > element)
			// first element in list has key value greater than k
			// No need to check other nodes because the newNode
			// will come at the beginning of list
			addFirst(element);
		else { // New node will go somewhere in the middle of the list
			Node current = head;
			Node previous = head;
			while (current != null && current.getElement() < element) {
				previous = current;
				current = current.getNext();
			}
			newNode.setNext(current);
			previous.setNext(newNode);
		}
		size++;
	}

	public boolean findNode(Node searchNode) {
		Node current = head;
		while (current != null) {
			if (current.getElement() == searchNode.getElement())
				return true;
			current = current.getNext();
		}
		return false;
	}

	public boolean modifyNode(int oldElement, int newElement) {
		Node current = head;
		while (current != null) {
			if (current.getElement() == oldElement) {
				current.setElement(newElement);
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public Node deleteFirst() {
		Node tmp;
		if (head == null)
			return null;
		tmp = head;
		head = head.getNext();
		tmp.setNext(null);
		size--;
		return tmp;
	}

	public Node deleteNode(int element) {
		Node current = head;
		Node previous = head;

		if (head == null)
			return null;
		while (current.getElement() != element && current.getNext() != null) {
			previous = current;
			current = current.getNext();
		}
		if (current.getElement() == element) {
			if (current == head)
				head = head.getNext();
			else
				previous.setNext(current.getNext());
			current.setNext(null);
			return current;
		}
		return null;
	}

	public void displayList() {
		Node current = head;
		System.out.println("List elements: ");
		while (current != null) {
			System.out.println("\t" + current);
			current = current.getNext();
		}
	}

	public String toString() {
		String result = "";
		Node current = head;
		while (current != null) {
			result += current + " ";
			current = current.getNext();
		}
		return result;
	}

	public void add(int element, int index) {
		// adds element at index index (index of first element being zero)
		Node newNode = new Node(element);
		if (head == null)
			head = newNode; // list is empty
		else {
			Node current = head;
			int i = 0;
			while (i < index - 1 && current.getNext() != null) {
				current = current.getNext();
				i++;
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
		size++;
	} // end add

	public int get(int index) {
		int i = 0;
		if (isEmpty()) {
			System.out.println("List is empty!");
			return -1;
		}
		if (index >= size) {
			System.out.println("Index out of range!");
			return -1;
		}
		Node current = head;
		while (i < index) {
			current = current.getNext();
			i++;
		}
		return current.getElement();
	} // end get

	// combine 2 linked lists
	public boolean combine(LinkedList l) {
		Node current = this.head;
		Node previous = this.head;
		if (current == null || l.getHead() == null) {
			return false;
		} else {
			this.size += l.getSize();
			while (current != null) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(l.getHead());
			return true;
		}
	}

} // end class LinkedList