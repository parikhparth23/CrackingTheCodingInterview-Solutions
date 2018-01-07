package LinkedLists;

public class Reverse {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static Node reverseLinkedList(Node head) {
		
		if(head == null) {
			return null;
		}
		
		Node previous = null;
		Node current = head;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		return head;
	}

	static void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	static void print(Node head) {
		while (head.next != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println(head.data);
	}

	public static void main(String[] args) {
		push(85);
		push(15);
		push(4);
		push(20);

		System.out.println("Created Linked list is: ");
		print(head);

		System.out.println("\nReversed Linked list is: ");
		print(reverseLinkedList(head));
	}
}
