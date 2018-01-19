package StacksandQueues;

import java.util.LinkedList;
import java.util.Stack;

public class StackOfPlates {
    static LinkedList<Stack<Integer>> stacks = new LinkedList<>();
    static final int STACK_SIZE = 3;

    static void push(int data) {
        if (stacks.isEmpty() || stacks.getLast().size() >= STACK_SIZE) {
            Stack<Integer> stack = new Stack<>();
            stack.push(data);
            stacks.add(stack);
        } else {
            stacks.getLast().push(data);
        }
    }

    static int pop() {
        if (stacks.isEmpty()) {
            throw new IllegalStateException("Stacks are empty");
        }

        Stack<Integer> last = stacks.getLast();
        int item = last.pop();
        if (last.isEmpty()) {
            stacks.removeLast();
        }

        return item;
    }

    static public void printStacks() {
        for (Stack<Integer> stack : stacks) {
            System.out.println("[Bottom]");
            for (int item : stack) {
                System.out.println(item + " ");
            }
            System.out.println("[TOP]");
        }
    }

    public static void main(String[] args) {
        StackOfPlates.push(1);
        StackOfPlates.push(2);
        StackOfPlates.push(3);
        StackOfPlates.push(4);
        StackOfPlates.push(5);
        StackOfPlates.push(6);
        StackOfPlates.push(7);
        StackOfPlates.push(8);
        StackOfPlates.push(9);
        StackOfPlates.printStacks();
        System.out.println("\n");
        StackOfPlates.pop();
        StackOfPlates.printStacks();
    }
}
