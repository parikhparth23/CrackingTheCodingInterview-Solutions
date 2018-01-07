package LinkedLists;

public class RemoveLoop {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static Node removeLoop(Node head) {

		Node slow = head;
		Node fast = head;

		// If list is empty or has only one node
		// without loop
		if (head == null || head.next == null) {
			return null;
		}

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		// if loop exists
		if (slow == fast) {
			slow = head;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			/* since fast->next is the looping point */
			fast.next = null; /* remove loop */
		}
		return head;
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
		// new_node.next = head;
		// head = new_node;

		if (head == null) {
			head = new Node(data);
			return;
		}

		new_node.next = null;
		Node tmp = head;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new_node;
	}

	public static void main(String[] args) {

		RemoveLoop.push(50);
		RemoveLoop.push(20);
		RemoveLoop.push(15);
		RemoveLoop.push(4);
		RemoveLoop.push(10);

		// Creating a loop
		head.next.next.next.next.next = head.next.next;

		System.out.println("Linked List after removing loop : ");
		printAll(RemoveLoop.removeLoop(head));

	}
}
