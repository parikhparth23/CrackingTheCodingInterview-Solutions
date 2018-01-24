package StacksandQueues;

import java.util.Queue;
import java.util.Stack;

public class QueueViaStacks {

    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();

    static void push(int value) {
        System.out.println("added to stack: " + input.push(value));
    }

    static int pop() {
        peek();
        return output.pop();
    }

    static int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    static boolean empty() {
        return input.empty() && output.empty();
    }

    public static void main(String[] args) {

        System.out.println("Is empty: " + empty());

        push(4);
        push(1);
        push(2);
        push(3);

        System.out.println("Is empty: " + empty());

        /* Dequeue items */
        System.out.println("Removed from stack: " + pop());
        System.out.println("Removed from stack: " +pop());
        System.out.println("Removed from stack: " +pop());

        System.out.println("Is empty: " + empty());

        push(5);

        System.out.println("Removed from stack: " +pop());

        System.out.println("Is empty: " + empty());
    }
}
