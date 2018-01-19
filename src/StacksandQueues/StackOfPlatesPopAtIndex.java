package StacksandQueues;

import java.util.LinkedList;

import java.util.Stack;

public class StackOfPlatesPopAtIndex {
    static final int STACK_SIZE = 3;
    static LinkedList<Stack<Integer>> stacks = new LinkedList<Stack<Integer>>();

    static void push(int data) {
        if (stacks.isEmpty() || stacks.getLast().size() >= STACK_SIZE) {
            Stack<Integer> stack = new Stack<>();
            stack.push(data);
            stacks.add(stack);
        } else {
            stacks.getLast().push(data);
        }
    }

    static int popAt(int index) {
        if (stacks.isEmpty()) {
            throw new IllegalStateException("Stacks are empty");
        }

        if (index < 0 || index >= stacks.size()) {
            throw new IllegalArgumentException("Invalid index!");
        }

        int item = stacks.get(index).pop();
        for (int i = index; i < stacks.size() - 1; ++i) {
            Stack<Integer> curr = stacks.get(i);
            Stack<Integer> next = stacks.get(i + 1);
            curr.push(next.remove(0));
        }
        if (stacks.getLast().isEmpty())
            stacks.removeLast();
        return item;
    }

    static void printStacks() {
        for (Stack<Integer> stack : stacks) {
            System.out.println("[Bottom]");
            for (int item : stack) {
                System.out.println(item + " ");
            }
            System.out.println("[Top]");
        }
    }

    public static void main(String[] args) {
        StackOfPlatesPopAtIndex.push(1);
        StackOfPlatesPopAtIndex.push(2);
        StackOfPlatesPopAtIndex.push(3);
        StackOfPlatesPopAtIndex.push(4);
        StackOfPlatesPopAtIndex.push(5);
        StackOfPlatesPopAtIndex.push(6);
        StackOfPlatesPopAtIndex.push(7);
        StackOfPlatesPopAtIndex.push(8);
        StackOfPlatesPopAtIndex.push(9);
        StackOfPlatesPopAtIndex.printStacks();
        System.out.println("\n");
        StackOfPlatesPopAtIndex.popAt(2);
        StackOfPlatesPopAtIndex.popAt(0);
        StackOfPlatesPopAtIndex.printStacks();
    }
}
