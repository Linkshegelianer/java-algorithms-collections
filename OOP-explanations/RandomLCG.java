/* The class Random implements a random number generator with using linear congruential generator.
 * It takes int as input and returns one random int which goes after the input.
 * The method reset() sets seed back to the original value. 
 */
class Random {
	private int seed;
	private int originalSeed;

	Random(int seed) {
		this.init = seed;
		this.seed = seed;
	}

	public void getNext() {
		seed = (1103515245 * seed + 12345) & 0x7FFFFFFF;
		return seed;
	}

	public int reset() {
		seed = originalSeed;
		return seed;
	}
}
