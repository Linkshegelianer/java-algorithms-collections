// F(0) = 0, F(1) = 1, F(n) = F(n - 1) + F(n - 2) 
public class FibNumbers {
	public static int findFibWithIterateCalcutation(int number) {
		int fib[] = new int[number + 2]; 

		fib[0] = 0; fib[1] = 1; // the first two numbers in Fibonacci sequence as a special case
		
		for (int i = 2; i <= number; i++) { // calculate each number by adding the previous two and assign the result to the current element of the array
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		return fib[number];
	}

	public static int findFibWithStoringNumbers(int number) { // use dynamic programming to store & re-use the already calculated Fibonacci numbers
    		if (number == 0) return 0; // special case for 0 & 1
   		if (number == 1) return 1;

    		int[] fib = new int[number + 1]; // array to store the already calculated fub numbers
    		fib[0] = 0;
    		fib[1] = 1;

    		for (int i = 2; i <= number; i++) {
        		fib[i] = fib[i - 1] + fib[i - 2]; // calculate each number by adding the previous two, which are stored in the array
    		}

    		return fib[number];
	}

	public static void main(String[] args) {
		int example = 10;
		System.out.println(findFibWithIterateCalcutation(example)); // must be 55
		System.out.println(findFibWithStoringNumbers(example)); // results must be the same
	}
}
