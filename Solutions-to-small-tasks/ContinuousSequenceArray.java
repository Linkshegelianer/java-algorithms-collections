// The code is checking if the input array is a continuous sequence of integers.
public class ContinuousSequenceArray {
	public static boolean isContinuousSequense(int[] input) {
		if (input == null || input.length <= 1) {
			return false;
		}
		
		int min = input[0]; 
		for (var i = 1; i <= input.length - 1; i++) {
			if (input[i] == min + 1) {
				min = input[i]; // the loop will continue until every element is checked, but if the sequence is wrong it will stop and return 'false' statement
			} else {
				return false;
			}
		}
		return true; 
	}

	public static void main(String[] args) {
		int[] example1 = {2};
	       	int[] example2 = {3, 4, 5};
		int[] example3 = {2, 5, 7};
		System.out.println(isContinuousSequense(example1)); // false
		System.out.println(isContinuousSequense(example2)); // true
		System.out.println(isContinuousSequense(example3)); // false
	}
}
