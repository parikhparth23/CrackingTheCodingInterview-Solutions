package StacksandQueues;

public class ThreeInOne {

	static class KStack {
		int arr[]; // Array of size n to store actual content to be stored in stacks
		int top[]; // Array of size k to store indexes of top elements of stacks
		int next[]; // Array of size n to store next entry in all stacks and free list

		int n, k;
		int free; // To store beginning index of free list

		KStack(int n, int k) {
			this.k = k;
			this.n = n;
			arr = new int[n];
			top = new int[k];
			next = new int[n];

			// Initialize all stacks as empty
			for (int i = 0; i < k; i++) {
				top[i] = -1;
			}

			// Initialize all spaces as free
			free = 0;
			for (int i = 0; i < n - 1; i++) {
				next[i] = i + 1;
			}
			next[n - 1] = -1; // -1 is used to indicate end of free list
		}
		
		// A utility function to check if there is space available
        boolean isFull() 
        {
            return (free == -1);
        }
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
