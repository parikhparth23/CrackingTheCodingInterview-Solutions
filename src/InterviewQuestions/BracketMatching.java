package InterviewQuestions;

import java.util.Stack;

public class BracketMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expression = "{}[] {()[]}";
		Stack<Character> st = new Stack<>();

		int len = expression.length();

		for (int i = 0; i < len; i++) {
			char ch = expression.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				st.push(ch);
			} else if ((ch == '}' || ch == ']' || ch == ')') && (!st.isEmpty())) {
				if (st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']' || st.peek() == '(' && ch == ')') {
					st.pop();
				} else {
					System.out.println("brackets do not match");
					return;
				}
			} else {
				if (ch == '}' || ch == ']' || ch == ')') {
					System.out.println("brackets do not match");
					return;
				}
			}
		}
		if (st.empty()) {
			System.out.println("backets matching");
		} else {
			System.out.println("brackets do not match");
		}
	}
}
