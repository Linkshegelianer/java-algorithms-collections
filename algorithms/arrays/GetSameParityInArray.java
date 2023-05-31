// The method takes an integer array and creates another one,
// which consists of elements that have the same parity as the first element of the input array
import java.util.Arrays; // to use Arrays.copyOfRange() and Arrays.toString()

class GetSameParityInArray {
	public static int[] getSameParity(int[] numbers) {
	var numbersCount = numbers.length;
		if (numbersCount == 0) { 
			return new int[0];
	       	}
		var firstNumber = Math.abs(numbers[0] % 2); // use Math.abs() method to get only the absolute value  
		var items = new int[numbersCount];
		var index = 0;
		for (var number : numbers) {
			if (Math.abs(number % 2) == firstNumber) {
				items[index] = number;
				index++;
			}
		}
		// returns a new array containing a copy of a range of elements from the original array
		return Arrays.copyOfRange(items, 0, index);
	}

	public static void main(String[] args) {
		int[] example = {1, 2, 3 , 4};
		System.out.println(Arrays.toString(getSameParity(example))); // should be [1, 3] 
	}
}
