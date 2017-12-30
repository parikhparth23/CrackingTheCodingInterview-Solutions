package ArraysAndStrings;

import java.util.HashMap;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabbcadad";
		s = s.toLowerCase();

		boolean foundOdd = false;

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == ' ') {
				continue;
			}
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}

		// System.out.println(hm.values());

		for (int i : hm.values()) {
			// System.out.println(i);
			if (i % 2 == 1) {
				if (foundOdd) {
					System.out.println("no permutation palindrome");
					return;
				}
				foundOdd = true;
			}
		}
		System.out.println("permutation palindrome");
	}
}
