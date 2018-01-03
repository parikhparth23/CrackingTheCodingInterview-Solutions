package LinkedLists;

import java.util.HashSet;

public class RemoveDups {

	public static void main(String[] args) {
		/* The constructed linked list is:
        		10->12->11->11->12->11->10
        	* it runs in o(N) time. N is number of elements
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
		Node prev = null;

		HashSet<Integer> hs = new HashSet<>();

		while (current != null) {
			int currval = current.data;

			if (hs.contains(currval)) {
				prev.next = current.next;
			} else {
				hs.add(currval);
				prev = current;
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