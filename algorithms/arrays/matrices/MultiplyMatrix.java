// Two matrices can be multiplied only if the number of columns in the first matrix
// matches the number of rows in the second matrix.
import java.util.Arrays; // for using Arrays.deepToString()

public class MultiplyMatrix {
	public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
		// Result of multiplying a matrix of size M×N by a matrix of size N×K is a matrix of size M×K.
		int[][] result = new int[matrixA.length][matrixB[0].length];

		for (var i = 0; i < matrixA.length; i++) { // for iterating through first matrix' rows
			for (var j = 0; j < matrixB[0].length; j++) { // for iterating through second matrix' columns
				for (var k = 0; k < matrixA[0].length; k++) { // for iterating through first matrix' columns
					result[i][j] = result[i][j] + matrixA[i][k] * matrixB[k][j]; 
					// three iterables show different parts (rows/cols) of both martices,
					// after initializing the loops we need to multiply values
					// of the needed elements and recursively add it to the result
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = {
			{1, 2},
			{4, 5}
		};
		int[][] b = {
			{2},
			{3}
		};
		System.out.println(Arrays.deepToString(multiply(a, b))); // must be [[8], [23]]
	}
}

