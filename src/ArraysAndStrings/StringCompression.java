package ArraysAndStrings;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabcccccaaa";
		char check = s.charAt(0);
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == check) {
				count++;
				if (i == s.length() - 1) {
					System.out.print(s.charAt(i));
					System.out.print(count);
				}
			} else {
				System.out.print(s.charAt(i - 1));
				System.out.print(count);
				check = s.charAt(i);
				count = 1;
				if (i == s.length() - 1) {
					System.out.print(s.charAt(i));
					System.out.print(count);
				}
			}
		}
	}

}
