package InterviewQuestions;

public class MoveZeroesToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int[] nums = { -1, 1, -1, 3, 12 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] == -1) {
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}
}
