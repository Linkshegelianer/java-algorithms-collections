/* The method accepts a string consisting only of '(' and ')' and checks whether this string is correct. 
 * A string is considered correct (balanced) if its structure meets the requirements:
 * Parens are paired chars, each '(' must have a corresponding ')'.
 * ')' should not go ahead of the '('.
*/

import java.util.Stack;
@SuppressWarnings("unchecked")
public class BalancedParens {
	public static boolean isBalanced(String str) {
		int count = 0;

		// turning str into an array of chars and using for-each to bypass the elements directly
		for (char ch : str.toCharArray()) {
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

	public static boolean isBalancedStack(String str) {
		if (str.length() % 2 != 0) return false; // the length must be even

		Stack<Character> stack = new Stack();
		for (char c : str.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false; // for cases like "([}}])"
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String example1 = "";
		String example2 = "))((";
		String example3 = "()()";
		System.out.println(isBalanced(example1)); // true
		System.out.println(isBalanced(example2)); // false
		System.out.println(isBalanced(example3)); // true
		System.out.println(isBalancedStack(example1)); // true
		System.out.println(isBalancedStack(example2)); // false
		System.out.println(isBalancedStack(example3)); // true
}
}
