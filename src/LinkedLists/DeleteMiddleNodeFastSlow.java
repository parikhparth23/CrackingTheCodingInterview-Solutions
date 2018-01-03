package LinkedLists;

public class DeleteMiddleNodeFastSlow {

	static class Node {
		String data;
		Node next;

		Node(String str) {
			data = str;
			next = null;
		}
	}

	public static void deleteMiddle(Node head) {
		if (head == null || head.next == null) {
			return;
		}

		Node slow = head;
		Node fast = head;
		Node prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
	}

	static void printAll(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start = new Node("A");
		start.next = new Node("B");
		start.next.next = new Node("C");
		start.next.next.next = new Node("D");
		start.next.next.next.next = new Node("E");
		start.next.next.next.next.next = new Node("F");
		// start.next.next.next.next.next.next = new Node("G");

		System.out.println("Gven Linked List: ");
		printAll(start);

		System.out.println("\nLinked List after deletion of middle: ");
		deleteMiddle(start);
		printAll(start);

	}

}
