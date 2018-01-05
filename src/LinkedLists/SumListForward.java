package LinkedLists;

public class SumListForward {

	static Node head1, head2;
	static int carry = 0;
	static Node res = null;

	static class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	static Node addForwardLL(Node first, Node second) {

		// first list is empty
		if (first == null) {
			res = second;
			return second;
		}

		// second list is empty
		if (second == null) {
			res = first;
			return first;
		}

		int size1 = getSize(first);
		int size2 = getSize(second);

		if (size1 < size2) {
			int size = size2 - size1;
			while (size > 0) {
				Node addZeroFront = new Node(0);
				addZeroFront.next = first;
				first = addZeroFront;
				size--;
			}
		}

		if (size1 > size2) {
			int size = size1 - size2;
			while (size > 0) {
				Node addZeroFront = new Node(0);
				addZeroFront.next = second;
				second = addZeroFront;
				size--;
			}
		}

		res = addForwardRecursion(first, second);

		// check for the carry forward, if not 0 then we need to create another node for
		// the end
		// example adding 1->1 and 9->9 then recursive function will return 0->0 and
		// carry =1

		if (carry != 0) {
			Node n = new Node(carry);
			n.next = res;
			res = n;
		}
		return res;
	}

	static int getSize(Node n) {
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		return count;
	}

	static Node addForwardRecursion(Node first, Node second) {

		if (first == null && second == null) {
			return null;
		}

		addForwardRecursion(first.next, second.next);

		int sum = first.data + second.data + carry;

		if (sum > 9) {
			carry = 1;
			sum = sum % 10;
		}

		Node tmp = new Node(sum);

		if (res == null) {
			res = tmp;
		} else {
			tmp.next = res;
			res = tmp;
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

		if (head1 == null) {
			head1 = new Node(data);
			return;
		}
		new_node.next = null;

		Node last = head1;
		while (last.next != null)
			last = last.next;

		last.next = new_node;
	}

	public static void push2(int data) {
		Node new_node = new Node(data);

		if (head2 == null) {
			head2 = new Node(data);
			return;
		}

		new_node.next = null;

		Node last = head2;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_node;
	}

	public static void main(String[] args) {
		SumListForward.push1(1);
		SumListForward.push1(1);
		SumListForward.push1(1);
		SumListForward.push1(7);
		System.out.println("Given Linked List 1: ");
		printAll(head1);

		SumListForward.push2(9);
		SumListForward.push2(9);
		SumListForward.push2(9);
		SumListForward.push2(9);
		System.out.println("\nGiven Linked List 2: ");
		printAll(head2);

		// add the two lists and see the result
		System.out.println("\nResultant List is: ");
		printAll(SumListForward.addForwardLL(head1, head2));
	}
}
