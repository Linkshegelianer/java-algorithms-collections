/* ternaty operator: (condition) ? (exp on true) : (exp on false) */
public class FizzBuzz {
	public static String fizzBuzz(int begin, int end) { 
		for (var i = begin; i <= end; i++) {
			var fizz = i % 3 == 0;
			var buzz = i % 5 == 0;
			var fizzPart = fizz ? "Fizz" : ""; // write "Fizz" if int is divisible by 3
			var buzzPart = buzz ? "Buzz" : ""; // write "Buzz" if int is divisible by 5
			System.out.println(fizz || buzz ? fizzPart + buzzPart : i); // write "FizzBuzz" without creating a third variable if both fizz & buzz are true
		}
	return "done!";
	}
	public static void main(String[] args) {
		System.out.println(fizzBuzz(1, 10)); // should be 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz done!
	}
}
