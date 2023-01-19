import java.util.Arrays; // import this class for Arrays.toString()  

public class SwapElementsInArray { 
	public static void swap(int[] numbers) {
	var length = numbers.length;

	if (length < 2) {
		return;
	}

	var lastElement = length - 1; 
	var temp = numbers[lastElement];
	numbers[lastElement] = numbers[0];
	numbers[0] = temp;
	}
	
	public static void main(String[] args) {
		int[] example1 = {1};
		int[] example2 = {2, 3, 4, 5, 6};
		SwapElementsInArray.swap(example1);
		SwapElementsInArray.swap(example2);
		System.out.println(Arrays.toString(example1)); // should be [1]
		System.out.println(Arrays.toString(example2)); // should be [6, 3, 4, 5, 2]
	}
}

