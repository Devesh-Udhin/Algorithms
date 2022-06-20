import java.util.*;

public class LinkedListApp {
	static Scanner scanIn = new Scanner(System.in);

	public static void main(String[] args) {
		// classActivity();
		number1i();
		// number1ii();
		// number1iii();
	} // end main

	public static void classActivity() {
		LinkedList myList = new LinkedList();
		int element;
		Node deleteNode;

		System.out.print("Input numbers (end list with 0): ");
		element = scanIn.nextInt();
		while (element != 0) {
			myList.addLast(element);
			element = scanIn.nextInt();
		}
		System.out.println("List contains: " + myList);

		System.out.print("Please enter element to delete: ");
		element = scanIn.nextInt();
		deleteNode = myList.deleteNode(element);
		System.out.println("Element deleted: " + deleteNode);
		System.out.println("List contains: " + myList);

		closeScanner();
	}

	public static void number1i() {
		LinkedList in = new LinkedList();
		int size = 6;
		for (int i = 0; i < size; i++) {
			in.addLast(i);
		}

		cumulativeSum(in).displayList();
	}

	public static void number1ii() {
		LinkedList in = new LinkedList();
		int size = 6;
		for (int i = 0; i < size; i++) {
			in.addLast(i);
		}

		LinkedList[] result = deal(in);
		result[0].displayList();
		System.out.println();
		result[1].displayList();
	}

	public static void number1iii() {
		LinkedList list = new LinkedList();
		list = createList();
		list.displayList();
	}

	public static LinkedList cumulativeSum(LinkedList in) {
		LinkedList out = new LinkedList();
		int element;
		out.addFirst(in.getHead().getElement());
		element = out.getHead().getElement();
		Node current = in.getHead().getNext();
		for (int i = 1; i < in.getSize(); i++) {
			out.addLast(element + current.getElement());
			element += current.getElement();

			current = current.getNext();
		}

		return out;
	}

	public static LinkedList[] deal(LinkedList list) {
		LinkedList odd = new LinkedList();
		LinkedList even = new LinkedList();
		LinkedList[] l = new LinkedList[] { odd, even };

		Node current = list.getHead();

		for (int i = 1; i <= list.getSize(); i++) {
			if (i % 2 == 0) {
				even.addLast(current.getElement());
			} else {
				odd.addLast(current.getElement());
			}
			current = current.getNext();
		}
		return l;

	}

	public static LinkedList createList() {
		LinkedList list = new LinkedList();
		int num;
		System.out.print("Enter size of list(number should be > 0): ");
		num = scanIn.nextInt();

		while (num <= 0) {
			System.out.print("Enter size of list(number should be > 0): ");
			num = scanIn.nextInt();
		}

		for (int i = 1; i <= num; i++) {
			System.out.print("Enter list number " + i + ": ");
			list.addLast(scanIn.nextInt());
		}

		return list;

	}

	public static void listToInt() {

	}

	private static void closeScanner() {
		scanIn.close();
	}
} // end class LinkedListApp