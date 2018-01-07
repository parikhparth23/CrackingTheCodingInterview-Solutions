package LinkedLists;

public class LinkedList {
	static Node head;
	static int size = 0;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	// push to head
	static void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		size++;
	}

	// append to linked list
	static void append(int data) {
		Node new_node = new Node(data);

		if (head == null) {
			size++;
			head = new Node(data);
			return;
		}

		new_node.next = null;

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		size++;
	}

	// insert at the middle
	static void insertAfter(int data, Node prev_node) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		size++;
	}

	// remove node
	static void deleteNode(int key) {
		Node tmp = head;
		Node prev = null;

		// if head itself needs to be removed
		if (tmp != null && tmp.data == key) {
			head = tmp.next;
			size--;
			return;
		}

		while (tmp != null && tmp.data != key) {
			prev = tmp;
			tmp = tmp.next;
		}

		if (tmp == null) {
			return;
		}

		prev.next = tmp.next;
		size--;
	}

	// remove node at position
	static void deleteAtPosition(int position) {
		if (head == null) {
			return;
		}

		Node tmp = head;

		if (position == 0) {
			head = tmp.next;
			size--;
			return;
		}

		for (int i = 0; i < position - 1 && tmp != null; i++) {
			tmp = tmp.next;
		}

		if (tmp == null || tmp.next == null) {
			return;
		}

		Node next = tmp.next.next;
		tmp.next = next;
		size--;
	}

	// print linked list
	static void printAll(Node head) {
		if (size == 0) {
			return;
		}
		while (head.next != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head.data);
	}

	public static void main(String[] args) {
		LinkedList.append(6);
		LinkedList.push(7);
		LinkedList.push(1);
		LinkedList.append(4);
		LinkedList.insertAfter(8, head.next);

		System.out.println("Created Linked list is: ");
		printAll(head);
		System.out.println("\nSize of Linked List is: " + size);

		LinkedList.deleteNode(8);
		System.out.println("\nLinked List after Deletion: ");
		printAll(head);
		System.out.println("\nSize of Linked List is: " + size);

		LinkedList.insertAfter(8, head.next);
		System.out.println("\nCreated Linked list is: ");
		printAll(head);
		System.out.println("\nSize of Linked List is: " + size);

		LinkedList.deleteAtPosition(3);
		System.out.println("\nLinked List after Deletion at position: ");
		printAll(head);
		System.out.println("\nSize of Linked List is: " + size);

	}
}
