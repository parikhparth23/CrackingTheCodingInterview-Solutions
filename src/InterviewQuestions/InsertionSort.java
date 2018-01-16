package InterviewQuestions;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 11, 13, 5, 6 };

		int len = arr.length;

		for (int i = 1; i < len; i++) {
			int hole = i;
			int value = arr[i];

			while (hole > 0 && arr[hole - 1] > value) {
				arr[hole] = arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
