package StacksandQueues;

import java.util.Stack;

public class SortStack {

    // Function return the sorted stack
    private static Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tmpStack = new Stack<>();

        while (!inputStack.isEmpty()) {
            // pop out the first element
            int tmp = inputStack.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                // pop from temporary stack and
                // push it to the input stack
                inputStack.push(tmpStack.pop());
            }
            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    // Driver function
    public static void main(String[] ags) {
        Stack<Integer> inputStack = new Stack<>();
        inputStack.add(34);
        inputStack.add(3);
        inputStack.add(31);
        inputStack.add(98);
        inputStack.add(92);
        inputStack.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack = sortStack(inputStack);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}
