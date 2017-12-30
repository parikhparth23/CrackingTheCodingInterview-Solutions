package ArraysAndStrings;

public class ReplaceSpaceWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Mr John Smith       ";

		char[] str = input.toCharArray();
		System.out.println(replaceSpaces(str, 13));
		/*
		 * 
		 * String output = ""; // A simple solution is to create an auxiliary // string
		 * and copy characters one by one. // Whenever a space is encountered, place %20
		 * in place of it.
		 * 
		 * // removing spaces from front and at the end
		 * 
		 * input = input.trim();
		 * 
		 * for (int i = 0; i < input.length(); i++) { char ch = input.charAt(i);
		 * 
		 * if (ch == ' ') { output = output + "%20"; } else { output = output + ch; } }
		 * 
		 * System.out.println(output);
		 * 
		 */

	}

	static String replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0;
		int index = 0;

		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		System.out.println(spaceCount);

		index = trueLength + spaceCount * 2;

		if (trueLength < str.length) {
			str[trueLength] = '\0';
		}

		for (int i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
		return new String(str).trim();
	}

}
