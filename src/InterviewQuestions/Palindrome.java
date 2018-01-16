package InterviewQuestions;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "madam";
		String reverse = "";

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		if (original.equals(reverse)) {
			System.out.println("given string is a palindrome string");
		} else {
			System.out.println("given string is not a palindrome string");
		}
	}
}
