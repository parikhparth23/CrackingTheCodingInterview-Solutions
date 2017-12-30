package ArraysAndStrings;

public class IsUnique {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a string: ");
		// isUnique = sc.next();

		// String isUnique = "geeks for geeks";
		String isUnique = "geks for";

		if (isUnique.length() > 128) {
			System.out.println("repeating chars 1");
			return;
		}

		boolean[] char_set = new boolean[128];

		for (int i = 0; i < isUnique.length(); i++) {
			int val = isUnique.charAt(i);

			if (char_set[val]) {
				System.out.println("repeating chars 2");
				return;
			}
			char_set[val] = true;
		}
		System.out.println("string is unique");
	}

}
