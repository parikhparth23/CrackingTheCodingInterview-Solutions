package InterviewQuestions;

public class IndexOfSmallestElement_Ebates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 5, 0, -9, 18 };
		int smallest = 0;

		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[smallest]) {
				smallest = i;
			}
		}

		System.out.println("index of smallest element is: " + smallest);
	}

}
