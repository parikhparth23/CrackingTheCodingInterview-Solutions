package LinkedLists;

public class DeleteMiddleNode {

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static void deleteMiddle(Node head) {
		int length = 0;
		Node tmp = head;
		Node prev = null;

		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}

		if (length == 0) {
			System.out.println("length is: " + length);
			return;
		}

		tmp = head;
		if (length % 2 == 0) {
			int n = length / 2;
			for (int i = 1; i < n ; i++) {
				prev = tmp;
				tmp = tmp.next;
			}
			prev.next = tmp.next;
		} else {
			int n = length / 2;
			for (int i = 1; i < n + 1; i++) {
				prev = tmp;
				tmp = tmp.next;
			}
			prev.next = tmp.next;
		}
	}

	static void printAll(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node start = new Node(1);
		start.next = new Node(2);
		start.next.next = new Node(3);
		start.next.next.next = new Node(4);
		start.next.next.next.next = new Node(5);
		start.next.next.next.next.next = new Node(6);
		// start.next.next.next.next.next.next = new Node(7);

		System.out.println("Given Linked List: ");
		printAll(start);

		System.out.println("\nLinked List after deletion of middle: ");
		deleteMiddle(start);
		printAll(start);

	}
}
