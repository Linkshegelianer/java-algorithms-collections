/*
Number is said to be an Armstrong number if the sum of its own digits raised to a power of digits results in the
number itself.
 */
public class ArmstrongNumber {

    public static boolean findArmstrongNumber(int input) {
        int originalInput = input;
        int digit;
        int cubeSum = 0;

        while (input != 0) {
            digit = input % 10; // set to the last digit of input
            cubeSum += Math.pow(digit, 3); // the cube of digit is calculated and added to cubeSum
            input /= 10; // the last digit is removed from original input
        }

        if (cubeSum == originalInput) { // compare with original value of the input
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int test1 = 153;
        int test2 = 370;
        int test3 = 30;
        System.out.println(findArmstrongNumber(test1)); // true
        System.out.println(findArmstrongNumber(test2)); // true
        System.out.println(findArmstrongNumber(test3)); // false
    }
}