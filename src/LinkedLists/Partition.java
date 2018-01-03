package LinkedLists;

public class Partition {

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static Node partition(Node head, int x) {

		/*
		 * Let us initialize first and last nodes of three linked lists 1) Linked list
		 * of values smaller than x. 2) Linked list of values equal to x. 3) Linked list
		 * of values greater than x.
		 */
		Node smallerPartHead = null;
		Node smallerPartTail = null;
		Node greaterPartHead = null;
		Node greaterPartTail = null;
		Node equalStart = null;
		Node equalEnd = null;

		// Now iterate original list and connect nodes
		// of appropriate linked lists.
		while (head != null) {
			Node next = head.next;
			head.next = null;

			if (head.data < x) {
				/* Insert node into end of before list */
				if (smallerPartHead == null) {
					smallerPartHead = head;
					smallerPartTail = smallerPartHead;
				} else {
					smallerPartTail.next = head;
					smallerPartTail = head;
				}
			} else if (head.data > x) {
				if (greaterPartHead == null) {
					greaterPartHead = head;
					greaterPartTail = greaterPartHead;
				} else {
					greaterPartTail.next = head;
					greaterPartTail = head;
				}
			} else {
				if (equalStart == null) {
					equalStart = head;
					equalEnd = equalStart;
				} else {
					equalEnd.next = head;
					equalEnd = head;
				}
			}
			head = next;
		}

		// Fix end of greater linked list to NULL if this
		// list has some nodes
		if (greaterPartTail != null)
			greaterPartTail.next = null;

		// Connect three lists
		// If smaller list is empty

		if (smallerPartHead == null) {
			if (equalStart == null) {
				return greaterPartHead;
			}
			equalEnd.next = greaterPartHead;
			return equalStart;
		}

		// If smaller list is not empty
		// and equal list is empty
		if (equalStart == null) {
			smallerPartTail.next = greaterPartHead;
			return smallerPartHead;
		}

		// If both smaller and equal list
		// are non-empty
		smallerPartTail.next = equalStart;
		equalEnd.next = greaterPartHead;

		return smallerPartHead;
	}

	static void printAll(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		Node start = new Node(10);
		start.next = new Node(4);
		start.next.next = new Node(20);
		start.next.next.next = new Node(10);
		start.next.next.next.next = new Node(3);
		// start.next.next.next.next.next = new Node(2);
		// start.next.next.next.next.next.next = new Node(1);

		System.out.println("Given Linked List: ");
		printAll(start);

		System.out.println("\nLinked List after deletion of middle: ");
		start = partition(start, 3);
		printAll(start);
	}

}
