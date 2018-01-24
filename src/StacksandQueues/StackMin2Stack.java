package StacksandQueues;

import java.util.Stack;

public class StackMin2Stack {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    StackMin2Stack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    static void push(int data) {
        stack.push(data);

        if (minStack.isEmpty() || minStack.peek() >= data) {
            minStack.push(data);
        }
    }

    static void pop() {
        if (!stack.isEmpty()) {
            int num = stack.pop();
            if (num == minStack.peek())
                minStack.pop();
        }
    }

    static int peek() {
        return stack.peek();
    }

    static int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
        StackMin2Stack.push(3);
        StackMin2Stack.push(5);
        System.out.println("Min in stack: " + StackMin2Stack.getMin());
        StackMin2Stack.push(2);
        StackMin2Stack.push(1);
        System.out.println("Min in stack: " + StackMin2Stack.getMin());
        StackMin2Stack.pop();
        System.out.println("Min in stack: " + StackMin2Stack.getMin());
        StackMin2Stack.pop();
        StackMin2Stack.peek();
        System.out.println("Min in stack: " + StackMin2Stack.getMin());
        System.out.println("Min in stack: " + StackMin2Stack.getMin());
    }

}
