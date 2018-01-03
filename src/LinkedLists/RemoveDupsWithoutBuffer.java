package LinkedLists;

public class RemoveDupsWithoutBuffer {

	public static void main(String[] args) {
		/*
		 * The constructed linked list is: 10->12->11->11->12->11->10 it runs in o(1)
		 * space but o(N) time.
		 */

		Node start = new Node(10);
		start.next = new Node(12);
		start.next.next = new Node(11);
		start.next.next.next = new Node(11);
		start.next.next.next.next = new Node(12);
		start.next.next.next.next.next = new Node(11);
		start.next.next.next.next.next.next = new Node(10);

		System.out.println("Linked list before removing duplicates :");
		printList(start);

		removeDuplicates(start);

		System.out.println("\nLinked list after removing duplicates :");
		printList(start);

	}

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static void removeDuplicates(Node head) {
		Node current = head;

		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

}
