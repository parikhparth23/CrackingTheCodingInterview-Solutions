package StacksandQueues;

public class QueuesUsingLL {

	static Node head, tail;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	static int peek() {
		return head.data;
	}

	static void add(int data) {
		Node new_node = new Node(data);

		if (tail != null) {
			tail.next = new_node;
		}
		tail = new_node;

		if (head == null) {
			head = new_node;
		}
		System.out.println(data + " added to the queue");
	}

	static int remove() {
		int data = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueuesUsingLL.add(5);
		QueuesUsingLL.add(15);
		QueuesUsingLL.add(25);
		System.out.println("Top element in the stack is: " + QueuesUsingLL.peek());
		System.out.println("Removing from stack: " + QueuesUsingLL.remove());
		System.out.println("Top element in the stack is: " + QueuesUsingLL.peek());
		QueuesUsingLL.add(25);
		System.out.println("Top element in the stack is: " + QueuesUsingLL.peek());

	}

}
