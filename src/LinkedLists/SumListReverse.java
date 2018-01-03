package LinkedLists;

public class SumListReverse {

	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static Node addReverseLL(Node first, Node second) {
		int sum = 0;
		int carry = 0;
		Node prev = null;
		Node tmp = null;
		Node res = null;

		while (first != null || second != null) {
			// if first or second node is not equal to null
			// then first.data or if it is null then zero
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);

			// update carry for next calculation
			carry = sum > 9 ? 1 : 0;

			// update sum if it is greater than 10
			sum = sum % 10;

			// Create a new node with sum as data
			tmp = new Node(sum);

			// if this is the first node then set it as head of
			// the resultant list
			if (res == null) {
				res = tmp;
			}
			// If this is not the first node then connect it to the rest.
			else {
				prev.next = tmp;
			}

			prev = tmp;

			// Move first and second pointers to next nodes
			if (first != null) {
				first = first.next;
			}
			if (second != null) {
				second = second.next;
			}
		}

		if (carry > 0) {
			tmp.next = new Node(carry);
		}

		return res;
	}

	static void printAll(Node head) {
		while (head.next != null) {
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.print(head.data);
	}

	public static void push1(int data) {
		Node new_node = new Node(data);

		new_node.next = head1;

		head1 = new_node;
	}

	public static void push2(int data) {
		Node new_node = new Node(data);

		new_node.next = head2;

		head2 = new_node;
	}

	public static void main(String[] args) {
		SumListReverse.push1(6);
		SumListReverse.push1(1);
		SumListReverse.push1(7);
		System.out.println("Given Linked List 1: ");
		printAll(head1);

		SumListReverse.push2(2);
		SumListReverse.push2(9);
		SumListReverse.push2(5);
		// SumListReverse.push2(0);
		System.out.println("\nGiven Linked List 2: ");
		printAll(head2);

		// add the two lists and see the result
		System.out.println("\nResultant List is: ");
		printAll(SumListReverse.addReverseLL(head1, head2));

	}

}
