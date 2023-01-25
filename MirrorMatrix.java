/* The method takes a two-dimensional array (matrix) with integers as an input and returns the matrix of the same size but the right half of the matrix is mirrored. 
 * The number of cols is always odd. 
 */

import java.util.Arrays; // for using Arrays.deepToString()

public class MirrorMatrix {
	public static int[][] getMirroredMatrix(int[][] inputMatrix) {
		int rows = inputMatrix.length; 
		int cols = inputMatrix[0].length;

		for (int i = 0; i < rows; i++) { // iterate over rows
			for (int j = 0; j < cols / 2; j++) { // iterate over cols
				inputMatrix[i][cols - 1 - j] = inputMatrix[i][j]; // copy values from first half to corresponding positions in the second half
			}
		}
		return inputMatrix;
	}
	
	public static void main(String[] args) {
		int[][] example1 = {
			{1, 2, 3, 4, 5, 6},
			{7, 8, 9, 10, 11, 12},
			{13, 14, 15, 16, 17, 18}
		};

		int[][] example2 = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		System.out.println(Arrays.deepToString(getMirroredMatrix(example1))); // must be [[1, 2, 3, 3, 2, 1], [7, 8, 9, 9, 8, 7], [13, 14, 15, 15, 14, 13]] 
		System.out.println(Arrays.deepToString(getMirroredMatrix(example2))); // must be [[1, 2, 2, 1], [5, 6, 6, 5], [9, 10, 10, 9]] 
	}
}
