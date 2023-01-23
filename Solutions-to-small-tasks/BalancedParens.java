/* The method accepts a string consisting only of '(' and ')' and checks whether this string is correct. 
 * A string is considered correct (balanced) if its structure meets the requirements:
 * Parens are paired chars, each '(' must have a corresponding ')'.
 * ')' should not go ahead of the '('.
*/
public class BalancedParens {
	public static boolean isBalanced(String str) {
		int count = 0; 

		for (char ch : str.toCharArray()) { // turning str into an array of chars and using for-each to bypass the elements directly
			if (ch == '(') {
				count++;
			} else if (ch == ')') {
				count--;
			}
			if (count < 0) {
				return false; // the number of '(' and ')' must be the same
			}
		}
		return count == 0; 
	}

	public static void main(String[] args) {
		String example1 = "";
		String example2 = "))((";
		String example3 = "()()";
		System.out.println(isBalanced(example1)); // should be true
		System.out.println(isBalanced(example2)); // should be false
		System.out.println(isBalanced(example3)); // should be true
}
}
