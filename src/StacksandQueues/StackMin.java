package StacksandQueues;

import java.util.Stack;

public class StackMin {
	static Stack<Integer> stack = new Stack<>();
	static int min = Integer.MAX_VALUE;

	public static void push(int x) {
		if (x <= min) {
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}

	public static void pop() {
		int peek = stack.pop();
		if (peek == min) {
			min = stack.pop();
		}
	}

	public static int peek() {
		return stack.peek();
	}

	public static int minStack() {
		return min;
	}

	public static void main(String[] args) {
		StackMin.push(3);
		StackMin.push(5);
		System.out.println("Min in stack: " + StackMin.minStack());
		StackMin.push(2);
		StackMin.push(1);
		System.out.println("Min in stack: " + StackMin.minStack());
		StackMin.pop();
		System.out.println("Min in stack: " + StackMin.minStack());
		StackMin.pop();
		StackMin.peek();
		System.out.println("Min in stack: " + StackMin.minStack());
		System.out.println("Min in stack: " + StackMin.minStack());
	}
}
