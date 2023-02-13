import java.util.Arrays; // for using Arrays.deepToString

public class RotateMatrix {
	public static int[][] rotateRight(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] result = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[j][rows - i - 1] = matrix[i][j];
			}
		}
		return result;
	}

	public static int[][] rotateLeft(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] result = new int[cols][rows];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[cols - j - 1][i] = matrix[i][j];
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		int[][] matrix1 = {
			{1, 2, 3, 4, 5, 6},
			{7, 8, 9, 0, 1, 2},
			{3, 4, 5, 6, 7, 8},
			{9, 0, 1, 2, 3, 4},
		};
		int[][] matrix2 = {
			{1, 2, 3, 4, 5, 6},
		};
		System.out.println(Arrays.deepToString(rotateLeft(matrix1))); // [[9, 3, 7, 1], [0, 4, 8, 2], [1, 5, 9, 3], [2, 6, 0, 4], [3, 7, 1, 5], [4, 8, 2, 6]] 
		System.out.println(Arrays.deepToString(rotateRight(matrix1))); // [[6, 2, 8, 4], [5, 1, 7, 3], [4, 0, 6, 2], [3, 9, 5, 1], [2, 8, 4, 0], [1, 7, 3, 9]]
	       	System.out.println(Arrays.deepToString(rotateLeft(matrix2))); // [[1], [2], [3], [4], [5], [6]]
		System.out.println(Arrays.deepToString(rotateRight(matrix2))); // [[6], [5], [4], [3], [2], [1]]
}
}
