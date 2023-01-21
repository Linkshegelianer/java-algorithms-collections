// The method takes an array and creates another one, which consists of elements that have the same parity as the first element of the input array
import java.util.Arrays;

class GetSameParityInArray {
	public static int[] getSameParity(int[] numbers) {
	var numbersCount = numbers.length;
		if (numbersCount == 0) { 
			return new int[0];
	       	}
		var firstNumber = Math.abs(numbers[0] % 2);
		var items = new int[numbersCount];
		var index = 0;
		for (var number : numbers) {
			if (Math.abs(number % 2) == firstNumber) {
				items[index] = number;
				index++;
			}
	       	}
		return Arrays.copyOfRange(items, 0, index);
	}

	public static void main(String[] args) {
		int[] example = {1, 2, 3 , 4}; // don't forget to use Arrays.toString to print the result if the output is an array!!!
		System.out.println(Arrays.toString(getSameParity(example))); // should be [1, 3] 
	}
}

