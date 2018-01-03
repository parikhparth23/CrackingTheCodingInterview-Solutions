package LinkedLists;

public class ReturnKthToLast {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int value) {
			data = value;
			next = null;
		}
	}

	void printNthFromLast(int n) {

		Node tmp = head;

		int length = 0;

		// get the length of LL
		while (tmp != null) {
			length++;
			tmp = tmp.next;
		}

		// check if the position is more than the length
		if (n > length) {
			return;
		}

		tmp = head;

		// get the (n-len+1)th node from the beginning
		for (int i = 1; i < (n - length + 1); i++) {
			tmp = tmp.next;
		}

		System.out.println("Kth word from end of LinkedList is: " + tmp.data);
	}

	public void push(int data) {
		Node new_node = new Node(data);

		new_node.next = head;

		head = new_node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnKthToLast llist = new ReturnKthToLast();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(35);

		llist.printNthFromLast(4);
	}
}
