package LinkedLists;

public class LoopDetection {

	static Node head;

	static class Node {
		char data;
		Node next;

		Node(char value) {
			data = value;
			next = null;
		}
	}

	static Node detectCycle(Node head) {
		Node fast = head;
		Node slow = head;

		slow = slow.next;
		fast = fast.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		if (fast == null || fast.next == null) {
			return null;
		}

		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}

	static void printAll(Node head) {
		// while (head.next != null) {
		// System.out.print(head.data + "->");
		// head = head.next;
		// }
		System.out.print(head.data);
	}

	// static void print(Node head) {
	// // while (head.next != null) {
	// // System.out.print(head.data + "->");
	// // head = head.next;
	// // }
	// System.out.print(head.data);
	// }

	static void push(char data) {
		Node new_data = new Node(data);

		new_data.next = head;
		head = new_data;
	}

	public static void main(String[] args) {

		LoopDetection.push('C');
		LoopDetection.push('E');
		LoopDetection.push('D');
		LoopDetection.push('C');
		LoopDetection.push('B');
		LoopDetection.push('A');
		head.next.next.next.next.next = head.next.next;

		System.out.println("Node at the beginning of the loop is: ");
		printAll(LoopDetection.detectCycle(head));
	}
}
