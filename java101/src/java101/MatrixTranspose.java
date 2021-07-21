package java101;


public class MatrixTranspose {
	public static void main(String args[]) {
		int original[][] = { { 2, 3, 4 }, { 5, 6, 4 } };
		int transpose[][] = new int[3][2];

		// !transposing the matrix!
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				transpose[i][j] = original[j][i];
			}
		}

		System.out.println("Printing Matrix without transpose:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing Matrix After Transpose:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}
