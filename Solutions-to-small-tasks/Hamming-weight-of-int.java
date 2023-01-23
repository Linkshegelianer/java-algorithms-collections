// Hamming weight is the number of set bits in the binary representation of the integer.
public class HammingWeightOfInt {
	public static int getHammingWeight(int input) {
		int weight = 0;
		while (input !=0) {
			if ((input & 1) == 1) { // check if the least significant bit of the input is equal to 1
				weight++;
			}
			input = input >>> 1; // the input is shifted right by one bit using the unsigned right shift operator ">>>"
		}
		return weight;
	}

	public static void main(String[] args) {
		int example1 = 0;
		int example2 = 4;
		int example3 = 444;
		System.out.println(getHammingWeight(example1)); // 0
		System.out.println(getHammingWeight(example2)); // 1
		System.out.println(getHammingWeight(example3)); // 6
	}
}
