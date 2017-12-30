package ArraysAndStrings;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("erbottlewat", "waterbottle"));
		System.out.println(isRotation("cat", "dog"));
	}

	public static boolean isRotation(String s1, String s2) {
		int len = s1.length();

		if (len == s2.length() && len > 0) {
			s1 = s1 + s1;
			return isSubstring(s1, s2);
		}
		return false;
	}

	private static boolean isSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.contains(s2);
	}

}
