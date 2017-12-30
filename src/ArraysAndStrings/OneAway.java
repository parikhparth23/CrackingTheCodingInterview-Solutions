package ArraysAndStrings;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "pale";
		String s2 = "ple"; // remove a char => true
		// String s2 = "pales"; //add a char => true
		// String s2 = "bale"; //change a char => true
		// String s2 = "bake"; // change 2 char => false

		// if s1<s2 char add method or if s1>s2 char remove method
		if (s1.length() + 1 == s2.length() || s1.length() == s2.length() + 1) {
			int i = 0;
			int j = 0;

			while (i < s1.length() && j < s2.length()) {
				if (s1.charAt(i) != s2.charAt(j)) {
					if (i != j) {
						System.out.println("more than one difference");
						return;
					}
					i++;
				} else {
					i++;
					j++;
				}
			}
			System.out.println("one difference");
			return;
		}

		// if s1==s2 char change method
		if (s1.length() == s2.length()) {
			boolean foundDifference = false;

			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					if (foundDifference) {
						System.out.println("more than one difference");
						return;
					}
					foundDifference = true;
				}
			}
			System.out.println("one difference");
			return;
		}
	}
}
