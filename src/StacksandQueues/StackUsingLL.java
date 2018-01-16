package StacksandQueues;

public class StackUsingLL {

	static Node head;

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

	static void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	static int pop() {
		int data = head.data;
		head = head.next;
		return data;
	}

	static void print(Node head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		StackUsingLL.push(5);
		StackUsingLL.push(15);
		StackUsingLL.push(25);
		
		System.out.println("Stack contains:");
		StackUsingLL.print(head);
		
		System.out.println("Poping from stack: " + StackUsingLL.pop());
		System.out.println("Top element in the stack is: " + StackUsingLL.peek());
		
		StackUsingLL.push(25);
		System.out.println("Stack contains:");
		StackUsingLL.print(head);
		System.out.println("Top element in the stack is: " + StackUsingLL.peek());
	}

}
