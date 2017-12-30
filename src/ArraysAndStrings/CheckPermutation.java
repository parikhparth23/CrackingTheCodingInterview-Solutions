package ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "dog";
		String s2 = "god";

		if (s1.length() != s2.length()) {
			System.out.print("Is one string permutation of other?: false");
			return;
		}

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.print("Is one string permutation of other?: ");
		System.out.println(Arrays.equals(c1, c2));
	}

}
