package ArraysAndStrings;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 1, 0, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 } };
		// int[][] a = { { 1, 1, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 1 } };

		System.out.println("Original Matrix is: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		boolean rawHasZero = false;
		boolean columnHasZero = false;

		// check if first row has any zero
		for (int j = 0; j < a[0].length; j++) {
			if (a[0][j] == 0) {
				rawHasZero = true;
				break;
			}
		}

		// check if first column has any zero
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] == 0) {
				columnHasZero = true;
				break;
			}
		}

		// check for zeros in rest of the array
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[0].length; j++) {
				if (a[i][j] == 0) {
					a[i][0] = 0;
					a[0][j] = 0;
				}
			}
		}

		// set Zeroes
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][0] == 0 || a[0][j] == 0)
					a[i][j] = 0;
			}
		}

		if (rawHasZero) {
			for (int j = 0; j < a[0].length; j++)
				a[0][j] = 0;
		}
		if (columnHasZero) {
			for (int i = 0; i < a.length; i++)
				a[i][0] = 0;
		}

		System.out.println();
		System.out.println("Zero Matrix is: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
