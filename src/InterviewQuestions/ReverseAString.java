package InterviewQuestions;

import java.util.regex.Pattern;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "The Sky is Blue";
		String reverse = "";
		String reverse2 = "";
		String reverse3 = "";

		Pattern compile = Pattern.compile(" ");

		String[] tmp = compile.split(original);

		for (int i = tmp.length - 1; i >= 0; i--) {
			reverse = reverse + tmp[i] + " ";
		}
		System.out.println(reverse.trim());

		for (int i = 0; i < tmp.length; i++) {
			for (int j = tmp[i].length() - 1; j >= 0; j--) {
				char ch = tmp[i].charAt(j);
				reverse2 = reverse2 + ch;
			}
			reverse2 = reverse2 + " ";
		}
		System.out.println(reverse2.trim());

		for (int i = original.length() - 1; i >= 0; i--) {
			reverse3 = reverse3 + original.charAt(i);
		}
		System.out.println(reverse3.trim());
	}
}
