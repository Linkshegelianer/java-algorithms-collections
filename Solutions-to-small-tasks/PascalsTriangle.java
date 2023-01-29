/*
Pascal's triangle is an infinite table of binomial coefficients having a triangular shape.
In this triangle, there are units at the top and on the sides.
Each number is equal to the sum of the two numbers above it.
The lines of the triangle are symmetrical with respect to the vertical axis.

The method generateRow returns the specified string of Pascal's triangle as an array of integers.
 */

import java.util.Arrays;
public class PascalsTriangle {
    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int[] generateRow(int row) {
        int[] result = new int[row + 1];
        for (int i = 0; i <= row; i++) {
            result[i] = factorial(row) / (factorial(i) * factorial(row - i));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRow(5)));
    }
}
