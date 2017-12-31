package ArraysAndStrings;

public class RotateMatrix {

	public static void main(String[] args) {
		 int original[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
		 14, 15, 16 } };

//		int original[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = original.length;

		System.out.println("Original Matrix is: ");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}

		// first mirror the matrix along the diagonal line.
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = original[i][j];
				original[i][j] = original[j][i];
				original[j][i] = tmp;
			}
		}

		System.out.println();
		System.out.println("mirror matrix is: ");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}
		
		// mirror the matrix horizontally.
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				int tmp = original[j][i];
				original[j][i] = original[j][n - i - 1];
				original[j][n - i - 1] = tmp;
			}
		}

		System.out.println();
		System.out.println("Rotated Matrix is: ");
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[i].length; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}
	}
}
