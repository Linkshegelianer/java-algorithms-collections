public class ClimbStairt {

	public static int climbStairs(int n) {
		if (n == 1) return 1;
		if (n == 2) return 2;

		int one = 1;
		int two = 1;

		for (int i = 2; i <= n; i++) {
			int cnt = one + two;
			two = one;
			one = cnt;
		}
		return one;
	}

	public static void main(String[] args) {
		System.out.println(climbStairs(5));
		System.out.println(climbStairs(100));
	}
}

