// The code is checking if the input int[] array is a continuous sequence
public class CheckContinuousSequence {
	public static boolean isContinuousSequence(int[] input) {
		if (input.length <= 1 || input == null) {
			return false;
		}

		int min = input[0];
		for (int i = 1; i < input.length - 1; i++) {
			if (input[i] == min + 1) {
			min = input[i];
			} else {
				return false; 
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] example1 = {1};
		int[] example2 = {1, 2, 3};
		int[] example3 = {1, 4, 7};
		System.out.println(isContinuousSequence(example1)); // false
		System.out.println(isContinuousSequence(example2)); // true
		System.out.println(isContinuousSequence(example3)); // false
	}
}
