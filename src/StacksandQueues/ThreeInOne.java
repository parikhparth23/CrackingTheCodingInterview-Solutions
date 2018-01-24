package StacksandQueues;

public class ThreeInOne {

    static class KStack {
        static int[] top;
        static int[] next;
        static int[] arr;

        int k, n;
        static int free;

        KStack(int k, int n) {
            this.k = k;
            this.n = n;

            top = new int[k];
            next = new int[n];
            arr = new int[n];

            free = 0;

            // Initialize all stacks as empty
            for (int i = 0; i < k; i++) {
                top[i] = -1;
            }

            // Initialize all spaces as free
            for (int i = 0; i < n - 1; i++) {
                next[i] = i + 1;
            }
            next[n - 1] = -1; // -1 is used to indicate end of free list
        }

        static boolean isFull() {
            return (free == -1);
        }

        static boolean isEmpty(int stackNumber) {
            return (top[stackNumber] == -1);
        }

        static void push(int value, int stackNumber) {
            // Overflow check
            if (isFull()) {
                System.out.println("Stack overflow");
                return;
            }

            int i = free; // Store index of first free slot

            // Update index of free slot to index of next slot in free list
            free = next[i];

            // Update next of top and then top for stack number 'stackNumber'
            next[i] = top[stackNumber];
            top[stackNumber] = i;

            // Put the item in array
            arr[i] = value;
        }

        static int pop(int stackNumber) {
            if (isEmpty(stackNumber)) {
                System.out.println("Stack underflow");
                return Integer.MAX_VALUE;
            }

            // Find index of top item in stack number 'stackNumber'
            int i = top[stackNumber];

            top[stackNumber] = next[i]; // Change top to store next of previous top

            // Attach the previous top to the beginning of free list
            next[i] = free;
            free = i;

            // Return the previous top item
            return arr[i];
        }
    }

    public static void main(String[] args) {
        // Let us create 4 stacks in an array of size 10
        int k = 3, n = 10;
        KStack ks = new KStack(k, n);

        KStack.push(15, 2);
        KStack.push(45, 2);

        // Let us put some items in stack number 1
        KStack.push(17, 1);
        KStack.push(49, 1);
        KStack.push(39, 1);

        // Let us put some items in stack number 0
        KStack.push(11, 0);
        KStack.push(9, 0);
        KStack.push(7, 0);

        System.out.println("Popped element from stack 2 is " + KStack.pop(2));
        System.out.println("Popped element from stack 1 is " + KStack.pop(1));
        System.out.println("Popped element from stack 0 is " + KStack.pop(0));
    }

}
