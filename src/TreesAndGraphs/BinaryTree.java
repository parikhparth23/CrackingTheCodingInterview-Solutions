package TreesAndGraphs;

public class BinaryTree {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    static void insert(Node root, int value) {
        if (value < root.data) {
            if (root.left == null) {
                System.out.println("Inserted " + value + " to left of " + root.data);
                root.left = new Node(value);
            } else {
                insert(root.left, value);
            }
        } else {
            if (root.right == null) {
                System.out.println("Inserted " + value + " to right of " + root.data);
                root.right = new Node(value);
            } else {
                insert(root.right, value);
            }
        }
    }

    static boolean contains(Node root, int value) {
        if (value == root.data) {
            return true;
        } else if (value < root.data) {
            if (root.left == null) {
                return false;
            } else {
                return contains(root.left, value);
            }
        } else {
            if (root.right == null) {
                return false;
            } else {
                return contains(root.right, value);
            }
        }
    }

    static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

    static void printPreOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }

    static void printPostOrder(Node root) {
        if (root != null) {
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        System.out.println("Root is: " + root.data);
        insert(root, 1);
        insert(root, 8);
        insert(root, 6);
        insert(root, 3);
        insert(root, 9);
        System.out.println("Tree contains value 0: " + contains(root, 0));
        System.out.print("\nInorder traversal: ");
        printInOrder(root);
        System.out.print("\nPre-order traversal: ");
        printPreOrder(root);
        System.out.print("\nPost-order traversal: ");
        printPostOrder(root);
    }
}

