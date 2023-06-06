/*
The algorithm takes an array of digits representing a number,
and returns this number incremented by one as the same array.
 */
import java.util.Arrays;

public class PlusOneArray {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++; // add one to the number
                return digits;
            }
            digits[i] = 0; // change 9 to 0
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] example1 = {1, 2, 3}; // 124
        int[] example2 = {9, 9, 9}; // 1000

        System.out.println(Arrays.toString(plusOne(example1)));
        System.out.println(Arrays.toString(plusOne(example2)));
    }
}