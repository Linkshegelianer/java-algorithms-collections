// The method takes an integer and returns another obtained from the first one by iteratively adding up all the digits included in it until one digit remains
public class AddDigitsFromInt {
	public static int addDigitsFromInt(int number) {
		var result = 0;
		while (number > 0) { // use while loop since the number of iterations is unknown & we don't need an iterable, only expression that should be true 
			result = result + number % 10; // remainder operator is used to sum the smallest digits
			number = number / 10; // move to the next radix 
		}
		result = (result < 10) ? result : addDigitsFromInt(result); // start another iteration if result has more than one radix
		return result;
	}

	public static void main(String[] args) {
		System.out.println(addDigitsFromInt(999)); // should be 9
	}
}
