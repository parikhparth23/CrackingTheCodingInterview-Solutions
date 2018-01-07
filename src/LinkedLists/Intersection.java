package LinkedLists;

public class Intersection {

	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static int intersectionNode(Node head1, Node head2) {

		if (head1 == null || head2 == null) {
			return -1;
		}

		int len1 = 0, len2 = 0;
		int tail1 = 0, tail2 = 0;
		Node curr1 = head1;
		Node curr2 = head2;

		while (head1 != null) {
			len1++;
			tail1 = head1.data;
			head1 = head1.next;
		}

		while (head2 != null) {
			len2++;
			tail2 = head2.data;
			head2 = head2.next;
		}

		if (tail1 != tail2) {
			return -1;
		} else {
		}

		if (len1 < len2) {
			while (len2 > len1) {
				curr2 = curr2.next;
				len2--;
			}
		} else if (len1 > len2) {
			while (len1 > len2) {
				curr1 = curr1.next;
				len1--;
			}
		}

		while (curr1 != null && curr2 != null) {
			if (curr1.data == curr2.data) {
				return curr1.data;
			}
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		return -1;
	}

	static void printAll(Node head) {
		while (head.next != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print(head.data);
	}

	static void push1(int data) {
		Node new_node = new Node(data);

		if (head1 == null) {
			head1 = new Node(data);
			return;
		}

		new_node.next = null;

		Node tmp = head1;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new_node;
	}

	static void push2(int data) {
		Node new_node = new Node(data);

		if (head2 == null) {
			head2 = new Node(data);
			return;
		}

		new_node.next = null;

		Node tmp = head2;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = new_node;
	}

	public static void main(String[] args) {
		Intersection.push1(3);
		Intersection.push1(1);
		Intersection.push1(5);
		Intersection.push1(9);
		Intersection.push1(7);
		Intersection.push1(2);
		Intersection.push1(1);
		System.out.println("LinkedList 1: ");
		printAll(head1);

		Intersection.push2(4);
		Intersection.push2(6);
		Intersection.push2(7);
		Intersection.push2(2);
		Intersection.push2(1);
		System.out.println("\n\nLinkedList 2: ");
		printAll(head2);

		System.out.println("\n\nThe node of intersection is: " + intersectionNode(head1, head2));

	}

}
