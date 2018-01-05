package LinkedLists;

import java.util.HashMap;

public class Palindrome {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.push(0);
		Palindrome.push(1);
		Palindrome.push(2);
		Palindrome.push(1);
		Palindrome.push(0);

		System.out.println("Given Linked List: ");
		printAll(head);

		boolean isEqual = isPalindrome(head);
		System.out.println("\nGiven LinkedList is palindrome?: " + isEqual);
	}

	static boolean isPalindrome(Node head) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		boolean foundOdd = false;

		while (head != null) {
			if (hm.containsKey(head.data)) {
				hm.put(head.data, hm.get(head.data) + 1);
			} else {
				hm.put(head.data, 1);
			}
			head = head.next;
		}

		for (int i : hm.values()) {
			if (i % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}

	}

	static void printAll(Node head) {
		while (head.next != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head.data);
	}

	static void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

}
