// The method takes an integer and returns another obtained from the first one
// by iteratively adding up all the digits included in it until one digit remains
public class AddDigitsFromInt {
	public static int addDigitsFromInt(int number) {
		var result = 0;
		while (number > 0) {
			result = result + number % 10; // remainder operator is used to sum the smallest digits
			number = number / 10; // move to the next radix 
		}
		// start another iteration if result has more than one radix
		result = (result < 10) ? result : addDigitsFromInt(result);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(addDigitsFromInt(999)); // should be 9
	}
}
